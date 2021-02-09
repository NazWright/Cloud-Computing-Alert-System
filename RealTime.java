/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.alertsystem;

import java.io.File;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author nazwright
 */
public class RealTime { 
    public List<Server> readServerData() throws Exception { 
        List<Server> servers = new ArrayList();
                Scanner scan = new Scanner(new File("src/main/resources/servers.csv")); 
               while(scan.hasNext()) { 
                   String [] line = scan.nextLine().split(",");
                  Server server = new Server(
                     Integer.parseInt(line[0]), Integer.parseInt(line[1]), 
                          Integer.parseInt(line[2]),Integer.parseInt(line[3])
                  );
                  servers.add(server);
               }
               
              
            return servers;   
    }
    
    
    public String getServerAlert( int serverId, int CPU, int MEM, int Disk) throws Exception{ 
        int numViolations = 0;
        String violations = "";
                if(CPU > 85) { 
                    violations += ",CPU_UTILIZATION VIOLATED";
                    numViolations++;
                      }
                if (MEM > 75) { 
                      violations += ",MEMORY_UTILIZATION VIOLATED";
                      numViolations++;
                   }
                if(Disk > 60) { 
                     violations += ",DISK_UTILIZATION VIOLATED";
                     numViolations++;
                    }
                
               if(numViolations > 0) { 
                   return "(Alert," + serverId + violations + ")";
               }
               else { 
                   return "(No Alert," + serverId + ")";
               }
       
    }
    
    
    
    
    
}
