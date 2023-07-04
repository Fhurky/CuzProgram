package CüzUygulması;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class UserFileHandler {
    private String fileName;
    
    public UserFileHandler(String fileName) {
        this.fileName = fileName;
    }
    
    public String[] readCredentials() {
        String[] credentials = new String[2];
        
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line = reader.readLine();
            if (line != null && line.contains(":")) {
                credentials = line.split(":");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        
        return credentials;
    }
    
    public void updateUsername(String newUsername) {
        String[] credentials = readCredentials();
        credentials[0] = newUsername;
        
        writeCredentials(credentials[0], credentials[1]);
    }
    
    public void updatePassword(String newPassword) {
        String[] credentials = readCredentials();
        credentials[1] = newPassword;
        
        writeCredentials(credentials[0], credentials[1]);
    }
    
    private void writeCredentials(String username, String password) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            String credentials = username + ":" + password;
            writer.write(credentials);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public String getUsername() {
        String[] credentials = readCredentials();
        return credentials[0];
    }
    
    public String getPassword() {
        String[] credentials = readCredentials();
        return credentials[1];
    }
}