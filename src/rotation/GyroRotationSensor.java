/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package rotation;

import edu.wpi.first.wpilibj.Gyro;

/**
 * Wrapper class for the gyro allowing interchanging of
 * encoders gyro for measuring rotation.
 * @author 708
 */
public class GyroRotationSensor extends RotationSensor{

    private Gyro gyro;

    public GyroRotationSensor(Gyro gyro){
        this.gyro = gyro;
    }

    public double getAngle(){
        return gyro.getAngle();
    }

    public void reset(){
        gyro.reset();
    }
}
