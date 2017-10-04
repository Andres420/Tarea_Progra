/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Code;

import Vehiculo.Deportivo;
import Vehiculo.Furgoneta;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Extreme pc
 */
public class Codigo_Archivos {

    public boolean Buscar(String placa, String nombre_archivo) {
        String line;
        boolean se_encuentra = false;
        try (BufferedReader br = new BufferedReader(new FileReader(nombre_archivo))) {
            while ((line = br.readLine()) != null) {
                if (line.equals(placa)) {
                    se_encuentra = true;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return se_encuentra;
    }

    public void Guardar(Deportivo deportivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/txt/deportivos.txt", true))) {
            bw.write(deportivo.getPlaca() +"\n");
            bw.write(deportivo.getMarca() +"\n");
            bw.write(deportivo.getColor() +"\n");
            bw.write(String.valueOf(deportivo.getPrecio()) +"\n");
            bw.write(deportivo.getPotencia() +"\n");
            bw.write(deportivo.getVelocidad() +"\n");
            JOptionPane.showMessageDialog(null, "Se ha guardado la informacion correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void Guardar(Furgoneta furgoneta) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("src/txt/furgonetas.txt", true))) {
            bw.write(furgoneta.getPlaca() +"\n");
            bw.write(furgoneta.getMarca() +"\n");
            bw.write(furgoneta.getColor() +"\n");
            bw.write(String.valueOf(furgoneta.getPrecio())+"\n");
            bw.write(furgoneta.getCan_Pasajeros() +"\n");
            bw.write(furgoneta.getDisponible()+"\n");
            JOptionPane.showMessageDialog(null, "Se ha guardado la informacion correctamente");
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public Deportivo Obtener_Vehiculo_Deport(String placa, String nombre_archivo) {
        Deportivo deport;
        int lineas_info = 0;
        String marca = "", color = "", potencia = "", velocidad = "", line;
        int precio = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombre_archivo))) {
            while ((line = br.readLine()) != null) {
                if (line.equals(placa)) {
                    lineas_info = +1;
                }
                switch (lineas_info) {
                    case 1:
                        marca = line;
                        break;
                    case 2:
                        color = line;
                        break;
                    case 3:
                        precio = Integer.parseInt(line);
                        break;
                    case 4:
                        potencia = line;
                        break;
                    case 5:
                        velocidad = line;
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        deport = new Deportivo(marca, color, placa, precio, potencia, velocidad);
        return deport;
    }

    public Furgoneta Obtener_Vehiculo_Furgo(String placa, String nombre_archivo) {
        Furgoneta furgo;
        int lineas_info = 0;
        String marca = "", color = "", cantidad_pasajeros = "", disponible = "", line;
        int precio = 0;
        try (BufferedReader br = new BufferedReader(new FileReader(nombre_archivo))) {
            while ((line = br.readLine()) != null) {
                if (line.equals(placa)) {
                    lineas_info = +1;
                }
                switch (lineas_info) {
                    case 1:
                        marca = line;
                        break;
                    case 2:
                        color = line;
                        break;
                    case 3:
                        precio = Integer.parseInt(line);
                        break;
                    case 4:
                        cantidad_pasajeros = line;
                        break;
                    case 5:
                        disponible = line;
                        break;
                    default:
                        break;
                }
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        furgo = new Furgoneta(marca, color, placa, precio, cantidad_pasajeros, disponible);
        return furgo;
    }

    public void Eliminar_deport(String placa) {
        String line;
        ArrayList<String> listatxt = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/txt/deportivos.txt"))) {
            while ((line = br.readLine()) != null) {
                listatxt.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < listatxt.size(); i++) {
            if (listatxt.get(i).equals(placa)) {
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
            }
        }
        Escribir(listatxt, "src/txt/deportvios.txt");
    }

    public void Eliminar_furgo(String placa) {
        String line;
        ArrayList<String> listatxt = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("src/txt/furgonetas.txt"))) {
            while ((line = br.readLine()) != null) {
                listatxt.add(line);
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        for (int i = 0; i < listatxt.size(); i++) {
            if (listatxt.get(i).equals(placa)) {
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
                listatxt.remove(i);
            }
        }
        Escribir(listatxt, "src/txt/furgonetas.txt");
    }

    public void Escribir(ArrayList lista, String nombre_archivo) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombre_archivo))) {
            for (int i = 0; i < lista.size(); i++) {
                bw.write(lista.get(i).toString() +"\n");
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }
}
