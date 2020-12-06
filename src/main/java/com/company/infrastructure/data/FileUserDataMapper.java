package com.company.infrastructure.data;

import java.io.*;

public class FileUserDataMapper extends AbstractUserDataMapper {

 //   private User[] users = new User[8]; // ---> классовая переменная

    public FileUserDataMapper(String filename) {
        System.out.println("Reading from file");
        try(FileReader fr = new FileReader(new File(filename));
            BufferedReader br = new BufferedReader(fr)) {

            String line;
            while((line = br.readLine()) != null){

                String[] parts = line.split(",");

                for (int i = 0; i < users.length; i++) {
                    if (users[i] == null) {
                        users[i] = new User(parts[0], parts[1], parts[2], parts[3]);;
                        break;
                     }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
