/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.iolani.frc.commands;

/**
 *
 * @author raridao
 */
public class ResetYawGyro extends CommandBase {
    
    public ResetYawGyro() {
        requires(drivetrain);
    }

    protected void initialize() {
        drivetrain.resetYawGyro();
    }

    protected void execute() {
    }

    protected boolean isFinished() {
        return true;
    }

    protected void end() {
    }

    protected void interrupted() {
    }
}
