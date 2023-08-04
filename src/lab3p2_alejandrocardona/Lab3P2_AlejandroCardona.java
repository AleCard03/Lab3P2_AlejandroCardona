
package lab3p2_alejandrocardona;

import java.awt.Color;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JColorChooser;
import java.util.Date;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Lab3P2_AlejandroCardona {
    
    static Scanner read = new Scanner(System.in);
    static Scanner readS = new Scanner(System.in);
    static ArrayList<Vehiculo> vehiculoLista = new ArrayList();
    
    public static void main(String[] args) throws ParseException {
    
        boolean continuar = true;
        
        while (continuar){
            
            System.out.println("""
                               ---Menu---
                               1. Agregar Automovil
                               2. Agregar Motocicleta
                               3. Agregar Autobus
                               4. Modificar Vehiculo
                               5. Eliminar Vehiculo
                               6. Mostrar Vehiculos
                               7. Generar Boleta
                               8. Salir""");
            
            int opcion = read.nextInt();
            
            switch (opcion){
                
                case 1 : {
                    
                    System.out.println("---Agregar Automovil---");
                    System.out.println("Ingrese una placa");
                    String placa = readS.nextLine();
                    System.out.println("Ingrese una marca");
                    String marca = readS.nextLine();
                    System.out.println("Ingrese un modelo");
                    String modelo = readS.nextLine();     
                    System.out.println("Ingrese el tipo del carro (Turismo, Camioneta, Etc.");
                    String tipoV = readS.nextLine();
                    System.out.println("Ingrese el año de lanzamiento del carro (yyyy)");
                    String fecha = readS.nextLine();
                    DateFormat df = new SimpleDateFormat("yyyy");
                    Date yearR = df.parse(fecha);
                    Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                    
                    System.out.println("Ingrese el tipo de combustible del automovil\n1. Diesel\n2. Regular\n3. Super");
                    int tipoComb = read.nextInt();
                    String comb ="";
                        switch(tipoComb){
                            
                            case 1 : {
                                
                                comb = "Diesel";
                                
                            }//fin case Diesel
                            break;
                            
                            case 2 : {
                             
                                comb = "Regular";
                                
                            }
                            break;
                            
                            case 3 : {
                                
                                comb = "Super";
                                
                            }//fin case 3
                            break;
                            
                        }
                    System.out.println("Ingrese la cantidad de puertas del automovil");
                    int puertas = read.nextInt();
                    System.out.println("Ingrese el tipo de transmision\n1. Manual\n2. Automática");
                    int tipoT = read.nextInt();
                    String transmision = "";
                    if (tipoT == 1){
                        transmision = "Manual";
                    }
                    else if( tipoT == 2){
                        transmision = "Automatica";
                    }
                    System.out.println("Ingrese la cantidad de asientos");
                    int asientos = read.nextInt();
                    
                    Automovil auto = new Automovil(comb, puertas, transmision, asientos,placa, marca, modelo, tipoV, yearR, color);
                    vehiculoLista.add(auto);
                    
                }//fin case 1
                break;
                
                case 2 : {
                    
                    System.out.println("---Agregar Motocicleta---");
                    System.out.println("Ingrese una placa");
                    String placa = readS.nextLine();
                    System.out.println("Ingrese una marca");
                    String marca = readS.nextLine();
                    System.out.println("Ingrese un modelo");
                    String modelo = readS.nextLine();     
                    System.out.println("Ingrese el tipo del carro(Turismo, Camioneta, Etc.");
                    String tipoV = readS.nextLine();
                    System.out.println("Ingrese el año de lanzamiento del carro (yyyy)");
                    String fecha = readS.nextLine();
                    DateFormat df = new SimpleDateFormat("yyyy");
                    Date yearR = df.parse(fecha);
                    Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                    
                    System.out.println("Ingrese la velocidad maxima de la motocicleta");
                    double maxSpeed = read.nextDouble();
                    System.out.println("Ingrese el peso de la moto");
                    double pesoM = read.nextDouble();
                    System.out.println("Ingrese el consumo del combustible");
                    double gasCons = read.nextDouble();
                    
                    Motocicleta moto = new Motocicleta(maxSpeed, pesoM, gasCons,placa, marca, modelo, tipoV, yearR, color);
                    vehiculoLista.add(moto);
                    
                }//fin case 2
                break;
                
                case 3 : {
                    
                    System.out.println("---Agregar Autobus---");
                    System.out.println("Ingrese una placa");
                    String placa = readS.nextLine();
                    System.out.println("Ingrese una marca");
                    String marca = readS.nextLine();
                    System.out.println("Ingrese un modelo");
                    String modelo = readS.nextLine();     
                    System.out.println("Ingrese el tipo del carro(Turismo, Camioneta, Etc.");
                    String tipoV = readS.nextLine();
                    System.out.println("Ingrese el año de lanzamiento del carro (yyyy)");
                    String fecha = readS.nextLine();
                    DateFormat df = new SimpleDateFormat("yyyy");
                    Date yearR = df.parse(fecha);
                    Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                    
                    System.out.println("Ingrese la capacidad del bus");
                    int capacidad = read.nextInt();
                    
                    System.out.println("Ingrese el numero de ejes del autobus");
                    int numEjes = read.nextInt();
                    
                    System.out.println("Ingrese la longitud del bus");
                    double longitud = read.nextDouble();
                    
                    Autobus bus = new Autobus(capacidad, numEjes, longitud,placa, marca, modelo, tipoV, yearR, color);
                    vehiculoLista.add(bus);
                    
                }//fin case 3
                break;
                
                case 4 : {
                    
                    printList();
                    int modV;
                    
                    do{
                        System.out.println("Ingrese el indice del vehiculo a modificar");
                        modV = read.nextInt();
                    }while(modV < 0 || modV >=vehiculoLista.size());
                    
                    
                    if (vehiculoLista.get(modV) instanceof Automovil){
                        
                        System.out.println("""
                                           Que desea modificar?
                                           1- Placa
                                           2- Marca
                                           3- Modelo
                                           4- Tipo
                                           5- Color
                                           6- Año
                                           7- Tipo Combustible
                                           8- Puertas
                                           9- Transmision
                                           10- Asientos""");
                        
                        int modOp = read.nextInt();
                        
                        switch(modOp){
                            
                            case 1 : {
                                
                                System.out.println("Ingrese una placa");
                                String placa = readS.nextLine();
                                vehiculoLista.get(modV).setMarca(placa);      
                                                                
                            }//fin case 1
                            break;
                            
                            case 2 : {
                                
                                System.out.println("Ingrese una marca");
                                String marca = readS.nextLine();
                                vehiculoLista.get(modV).setMarca(marca);
                                
                            }//fin case 2
                            break;
                            
                            case 3 : {
                                
                                System.out.println("Ingrese un modelo");
                                String modelo = readS.nextLine();   
                                vehiculoLista.get(modV).setModelo(modelo);
                                
                                
                                
                            }//fin case 3
                            break;
                            
                            case 4 : {
                                
                                System.out.println("Ingrese el tipo del carro (Turismo, Camioneta, Etc.");
                                String tipoV = readS.nextLine();
                                vehiculoLista.get(modV).setTipo(tipoV);
                                
                                
                            }//fin case 4
                            break;
                            
                            case 5 : {
                                
                                System.out.println("Ingrese el año de lanzamiento del carro (yyyy)");
                                String fecha = readS.nextLine();
                                DateFormat df = new SimpleDateFormat("yyyy");
                                Date yearR = df.parse(fecha);
                                vehiculoLista.get(modV).setAño(yearR);
                                
                            }//fin case 5
                            break;
                            
                            case 6 : {
                                
                                Color color = JColorChooser.showDialog(null, "Ingrese el color del vehiculo", Color.yellow);
                                vehiculoLista.get(modV).setColor(color);
                                
                            }//fin case 6
                            break;
                            
                            case 7 : {
                                
                                System.out.println("Ingrese el tipo de combustible del automovil\n1. Diesel\n2. Regular\n3. Super");
                                int tipoComb = read.nextInt();
                                String comb ="";
                                switch(tipoComb){

                                    case 1 : {

                                        comb = "Diesel";

                                    }//fin case Diesel
                                    break;

                                    case 2 : {

                                        comb = "Regular";

                                    }
                                    break;

                                    case 3 : {

                                        comb = "Super";

                                    }//fin case 3
                                    break;

                                }
                                ((Automovil)vehiculoLista.get(modV)).setComb(comb);
                                
                            }//fin case 7
                            break;
                            
                            case 8 : {
                                
                                System.out.println("Ingrese la cantidad de puertas del automovil");
                                int puertas = read.nextInt();
                                ((Automovil)vehiculoLista.get(modV)).setPuestas(puertas);
                                
                                
                            }//fin case 8
                            break;
                            
                            case 9 : {
                                
                                System.out.println("Ingrese el tipo de transmision\n1. Manual\n2. Automática");
                                int tipoT = read.nextInt();
                                String transmision = "";
                                if (tipoT == 1){
                                    transmision = "Manual";
                                }
                                else if( tipoT == 2){
                                    transmision = "Automatica";
                                }
                                ((Automovil)vehiculoLista.get(modV)).setTransmision(transmision);
                                
                            }//fin case 9
                            break;
                            
                            case 10 : {
                                
                                System.out.println("Ingrese la cantidad de asientos");
                                int asientos = read.nextInt();
                                ((Automovil)vehiculoLista.get(modV)).setAsientos(asientos);
                                
                            }//fin case 10
                            break;
                            default : {
                                
                                System.out.println("Ingreso una opcion no valida");
                                
                            }
                            break;
                            
                        }//fin switch
                        
                        
                    }
                    
                }//fin case 4
                break;
                
                case 5 : {
                    
                    
                    
                }//fin case 5
                break;
                
                case 6 : {
                    
                    printList();
                    
                }//fin case 6
                break;
                
                case 7 : {
                    
                    
                    
                }//fin case 7
                break;
                
                case 8 : {
                    
                    continuar = false;
                    
                }//fin case 8
                break;
                
                default : {
                    
                    System.out.println("Ingreso un valor invalido");
                    
                }//Fin default
                break;
                
            }
        }
        
    }//fin main
    
    static void printList (){
        
        String acum = "";
        for (Vehiculo vehiculo : vehiculoLista) {
            
            acum += vehiculoLista.indexOf(vehiculo)+"- "+vehiculo+"\n";
            
        }
        System.out.println(acum);
        
    }//fin printList
    
}
