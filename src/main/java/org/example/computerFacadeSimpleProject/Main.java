package org.example.computerFacadeSimpleProject;

import org.example.computerFacadeSimpleProject.CPU;
import org.example.computerFacadeSimpleProject.ComputerFacade;
import org.example.computerFacadeSimpleProject.HardDrive;
import org.example.computerFacadeSimpleProject.Memory;

public class Main {
    public static void main(String[] args) {
        CPU cpu = new CPU();
        Memory memory = new Memory();
        HardDrive hd = new HardDrive();

        ComputerFacade computerFacade = new ComputerFacade(cpu,memory,hd);
        computerFacade.start();
    }
}