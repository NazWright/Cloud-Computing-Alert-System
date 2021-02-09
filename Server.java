/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alertsystem;

/**
 *
 * @author nazwright
 */
public class Server {
    
    private int serverId; 
    private int CPU_Utilization; 
    private int MEM_Utilization;
    private int DISK_Utilization; 
    
    public Server(int serverId, int CPU_Utilization, int MEM_Utilization, int DISK_Utilization) { 
         this.serverId = serverId; 
         this.CPU_Utilization = CPU_Utilization; 
         this.MEM_Utilization = MEM_Utilization; 
         this.DISK_Utilization = DISK_Utilization; 
    }

    /**
     * @return the serverId
     */
    public int getServerId() {
        return serverId;
    }

    /**
     * @param serverId the serverId to set
     */
    public void setServerId(int serverId) {
        this.serverId = serverId;
    }

    /**
     * @return the CPU_Utilization
     */
    public int getCPU_Utilization() {
        return CPU_Utilization;
    }

    /**
     * @param CPU_Utilization the CPU_Utilization to set
     */
    public void setCPU_Utilization(int CPU_Utilization) {
        this.CPU_Utilization = CPU_Utilization;
    }

    /**
     * @return the MEM_Utilization
     */
    public int getMEM_Utilization() {
        return MEM_Utilization;
    }

    /**
     * @param MEM_Utilization the MEM_Utilization to set
     */
    public void setMEM_Utilization(int MEM_Utilization) {
        this.MEM_Utilization = MEM_Utilization;
    }

    /**
     * @return the DISK_Utilization
     */
    public int getDISK_Utilization() {
        return DISK_Utilization;
    }

    /**
     * @param DISK_Utilization the DISK_Utilization to set
     */
    public void setDISK_Utilization(int DISK_Utilization) {
        this.DISK_Utilization = DISK_Utilization;
    }
    @Override
    public String toString() { 
        return "(" + getServerId() + "," + getCPU_Utilization() + "," + getMEM_Utilization() + ","
                + getDISK_Utilization()+ ")";
        
    }
}
