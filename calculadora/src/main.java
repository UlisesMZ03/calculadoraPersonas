import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
//import javafx.fxml.FXML;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
//import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class main extends Application {
    private Persona persona1;
    private Persona persona2;
    private Persona persona3;
    private Persona persona4;
    private Persona opcion1;
    private Persona opcion2;
    
    
    private int resultado = 0;
    
    
    public void sumarEdades() {
    int sumaEdades = opcion1.getEdad() + opcion2.getEdad();
        resultado = sumaEdades;
    
        System.out.println(resultado);
}
    
    public void restarEdades() {
        int restaEdades = opcion1.getEdad() - opcion2.getEdad();
        resultado = restaEdades;
        System.out.println("La resta de las edades es: " + restaEdades);
    }
    
    public void multiplicarEdades() {
        int multiplicacionEdades = opcion1.getEdad() * opcion2.getEdad();
        resultado = multiplicacionEdades;
        System.out.println("La multiplicación de las edades es: " + multiplicacionEdades);
    }
    
    public void dividirEdades() {
        double divisionEdades = (double) opcion1.getEdad() / opcion2.getEdad();
        resultado = (int) divisionEdades;
        System.out.println("La división de las edades es: " + divisionEdades);
    }

    @Override
    
    public void start(Stage primaryStage) throws Exception {
        
        
        

        
        
        
        primaryStage.setTitle("Calculadora de edades");
        GridPane gridPane = new GridPane();
        gridPane.setHgap(10);
        gridPane.setVgap(10);

        Label labelEdad = new Label("Edad:");
        TextField textFieldEdad = new TextField();
        gridPane.add(labelEdad, 0, 2);
        gridPane.add(textFieldEdad, 1, 2);

        Label labelNombre = new Label("Nombre:");
        TextField textFieldNombre = new TextField();
        gridPane.add(labelNombre, 0, 3);
        gridPane.add(textFieldNombre, 1, 3);

        Label labelProvincia = new Label("Provincia:");
        gridPane.add(labelProvincia, 0, 4);
        

        Button buttonAgregar = new Button("Agregar");
        gridPane.add(buttonAgregar, 1, 5);
        
        
        
        Label labelResultado = new Label("Resultado");
        gridPane.add(labelResultado, 0, 5, 4, 1);
        
        
        
        
        
        
        
        
        
                
        Button buttonSumar = new Button("+");
        gridPane.add(buttonSumar, 3, 4);
        buttonSumar.setOnAction(event -> {
            sumarEdades();
            TextField textFieldResult = new TextField();
            textFieldResult.setText("Resultado: " + resultado);
            textFieldResult.setEditable(false);
            gridPane.add(textFieldResult, 1, 7);
        });

        Button buttonRestar = new Button("-");
        gridPane.add(buttonRestar, 3, 5);
        buttonRestar.setOnAction(event -> {
            restarEdades();
            TextField textFieldResult = new TextField();
            textFieldResult.setText("Resultado: " +resultado);
            textFieldResult.setEditable(false);
            gridPane.add(textFieldResult, 1, 7);
        });

        Button buttonMultiplicar = new Button("*");
        gridPane.add(buttonMultiplicar, 4, 4);
        buttonMultiplicar.setOnAction(event -> {
            multiplicarEdades();
            TextField textFieldResult = new TextField();
            textFieldResult.setText("Resultado: " +resultado);
            textFieldResult.setEditable(false);
            gridPane.add(textFieldResult, 1, 7);
        });

        Button buttonDividir = new Button("/");
        gridPane.add(buttonDividir, 4, 5);
        buttonDividir.setOnAction(event -> {
            dividirEdades();
            TextField textFieldResult = new TextField();
            textFieldResult.setText("Resultado: " +Integer.toString(resultado));
            textFieldResult.setEditable(false);
            gridPane.add(textFieldResult, 1, 7);
        });

        
        
        
        
        
        Label elegirPersona1 = new Label("Persona 1");
        gridPane.add(elegirPersona1, 3, 2);
        Label elegirPersona2 = new Label("Persona 2");
        gridPane.add(elegirPersona2, 3, 3);
        
        
        
        // Lista de provincias de Costa Rica
        List<String> provincias = Arrays.asList("San José", "Alajuela", "Cartago", "Heredia", "Guanacaste", "Puntarenas", "Limón");

        // ChoiceBox para seleccionar la provincia
        ChoiceBox<String> choiceBoxProvincia = new ChoiceBox<>();
        ObservableList<String> itemsProvincia = FXCollections.observableArrayList(provincias);
        choiceBoxProvincia.setItems(itemsProvincia);
        gridPane.add(choiceBoxProvincia, 1, 4);
        
        
        
        ChoiceBox<String> choiceBox1 = new ChoiceBox<>();
        ObservableList<String> items = FXCollections.observableArrayList();
        choiceBox1.setItems(items);
        gridPane.add(choiceBox1, 4, 2);
        List<String> opciones = new ArrayList<>();
        
        ChoiceBox<String> choiceBox2 = new ChoiceBox<>();
        choiceBox2.setItems(items);
        gridPane.add(choiceBox2, 4, 3);
        
        
        choiceBox1.setOnAction(event -> {
        String seleccion = choiceBox1.getValue();
        System.out.println(items.size());
        if(seleccion==persona1.getNombre()){
            opcion1 = persona1;
            
        }
        if (items.size()==2){
            if(seleccion==persona2.getNombre()){
                opcion1 = persona2;
            }
        }
        if (items.size()==3){
            if(seleccion==persona3.getNombre()){
                opcion1 = persona3;}
        }
        if (items.size()==4){
            if(seleccion==persona4.getNombre()){
                opcion1 = persona4;}
            }
        System.out.println("Valor seleccionado: " + seleccion);
        System.out.println(opciones);
    });
        choiceBox2.setOnAction(event -> {
        String seleccion2 = choiceBox2.getValue();
        if(seleccion2==persona1.getNombre()){
            opcion2 = persona1;
            
        }
        if (items.size()==2){
            if(seleccion2==persona2.getNombre()){
                opcion2 = persona2;}
        }
        if (items.size()==3){
            if(seleccion2==persona3.getNombre()){
                opcion2 = persona3;}
        }
        if (items.size()> 3){
            if(seleccion2==persona4.getNombre()){
                opcion2 = persona4;}
        }
        
        
        
        
        
        System.out.println("Valor seleccionado: " + seleccion2);
        System.out.println(opciones);
    });
        
        
        
        
        
       
        
     
        

        // Crea una escena y muestra el contenedor con el ChoiceBox
        
        
    
       
      
        
        
        buttonAgregar.setOnAction(event -> {
        int cantPersonas = items.size();
        
        
        
        if (cantPersonas<4) {
            int edad = Integer.parseInt(textFieldEdad.getText());
            String nombre = textFieldNombre.getText();
            String provincia = choiceBoxProvincia.getValue();
            
            if (( textFieldNombre.getText().length()==0)|| ( choiceBoxProvincia.getValue().length()==0) || (textFieldEdad.getText()==null)) 
                System.out.println("Erorr");
            
                else {
                    Persona persona = new Persona(edad, nombre, provincia);
                    List<String> datos = new ArrayList<>();

                    //datos.add(persona.getNombre());
                    //datos.add(persona.getProvincia());
                    //datos.add(String.valueOf(persona.getEdad()));
                    if (cantPersonas==0){
                            persona1 = persona;
                    }
                    if (cantPersonas>0){
                            persona2 = persona;
                            }
                    if (cantPersonas>1){
                            persona3= persona;
                            }
                    if (cantPersonas>2){
                            persona4= persona;
                            }

                    items.add(persona.getNombre());


                    System.out.println(persona1);
                    System.out.println(provincia);
                }}});
        
            
            
            
            
            
        
        
        
        
        
        Scene scene = new Scene(gridPane, 400, 300);
        primaryStage.setScene(scene);
        primaryStage.show();
        
    }
    
    public static void main(String[] args) {
        
        launch(args);
    }
}
