package dk.kea.dat18i.spring.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.support.rowset.SqlRowSet;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarRepository {

    @Autowired
    private JdbcTemplate jdbc;

    public Car findCar(int id){
        SqlRowSet rs = jdbc.queryForRowSet("SELECT * FROM cars WHERE id = "+id);
        Car car = new Car();
        while (rs.next()){
            car.setId(rs.getInt("id"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMaxSpeed(rs.getDouble("max_speed"));
            car.setReg(rs.getString("reg"));
        }
        return car;
    }

    public List<Car> findAllCars(){
        SqlRowSet rs = jdbc.queryForRowSet("SELECT * FROM cars");
        List<Car> carList = new ArrayList<>();
        while (rs.next()){
            Car car = new Car();
            car.setId(rs.getInt("id"));
            car.setBrand(rs.getString("brand"));
            car.setColor(rs.getString("color"));
            car.setMaxSpeed(rs.getDouble("max_speed"));
            car.setReg(rs.getString("reg"));

            carList.add(car);
        }
        return carList;
    }


}
