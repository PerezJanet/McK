package mck;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.*;
import javafx.stage.Stage;

public class McK extends Application {
    int total;
    int des;
    int papa;
    int gas;
    int postre;
    int cupon;
    boolean veces;
   
    String cambio;
    
    int cantsub;
    int canttotal;
    int c;
    int i=0;
    int s,s1,s2,s3,s4;
 public static void main(String[] args) {
        launch(args);}    
    @Override
    public void start(final Stage primaryStage) {
        primaryStage.setTitle("Mac Kombo Ventas");
        
        Group root = new Group();
        Group root2= new Group();
       final Scene scene = new Scene (root,600,300);
       final Scene scene2 = new Scene(root2, 600, 400);
                
        final Button btnPapas = new Button();
        btnPapas.setText("Papas $10");
        btnPapas.setLayoutX(50);
        btnPapas.setLayoutY(100);
        
        final Button btnGas = new Button();
        btnGas.setText("Gaseosa $12");
        btnGas.setLayoutX(50);
        btnGas.setLayoutY(150);
        
        final Button btnPostre = new Button();
        btnPostre.setText("Postre $15");
        btnPostre.setLayoutX(50);
        btnPostre.setLayoutY(200);
        
        final TextField txtPb = new TextField();
        txtPb.setLayoutX(50);
        txtPb.setLayoutY(50);
        
        
        final Label etiPb = new Label();
        etiPb.setLayoutX(50);
        etiPb.setLayoutY(25);
        etiPb.setText("Precio Básico");
                
        final Label etiTotal = new Label();
        etiTotal.setLayoutX(350);
        etiTotal.setLayoutY(25);
        etiTotal.setText("Total a Pagar");
        
        final TextField txtTotal = new TextField();
        txtTotal.setLayoutX(350);
        txtTotal.setLayoutY(50);
        
         final Button btnDes = new Button();
        btnDes.setText("Descuento %10 Cupòn");
        btnDes.setLayoutX(350);
        btnDes.setLayoutY(100);
        
        final Label etiPapa = new Label();
        etiPapa.setLayoutX(30);
        etiPapa.setLayoutY(100);
        etiPapa.setText(Integer.toString(papa));
        
        final Label etiGas = new Label();
        etiGas.setLayoutX(30);
        etiGas.setLayoutY(150);
        etiGas.setText(Integer.toString(gas));
        
        final Label etiPostre = new Label();
        etiPostre.setLayoutX(30);
        etiPostre.setLayoutY(200);
        etiPostre.setText(Integer.toString(postre));
        
        final Button btnReset = new Button();
        btnReset.setText("Reset");
        btnReset.setLayoutX(350);
        btnReset.setLayoutY(150);
            
            Label [] titulos =new Label[4];
            for(i=0;i<4;i++)
            {
                titulos[i] = new Label();
                titulos [i].setLayoutY(10);
                titulos[i].setLayoutX(10+90*i);
                titulos[i].setText("Cantidad");
                root2.getChildren().add(titulos[i]); 
              }                  
            titulos[1].setLayoutX(100);
            titulos[2].setLayoutX(300);
            titulos[3].setLayoutX(400);
          
            
            titulos[1].setText("Promo");          
            titulos[2].setText("Precio");           
            titulos[3].setText("Total");         
      
           
          final Label cant[]= new Label[5];
            for(i=0;i<5;i++)
            {
                cant[i]=new Label();
                cant[i].setText("0");
            cant[i].setLayoutX(10);
            cant[i].setLayoutY(40+40*i);
            root2.getChildren().add(cant[i]);
            }

            Button btn[] = new Button[5];
            for(i=0;i<5;i++)
            { 
            btn[i]= new Button();
            btn[i].setLayoutX(100);
            btn[i].setLayoutY(40+40*i);
            btn[i].setText("Burguer-Queen");
            root2.getChildren().add(btn[i]);
            }
                     
            btn[1].setText("Super-Mac");          
            btn[2].setText("Menú para Chicos");           
            btn[3].setText("Tostado Vegetariano");           
            btn[4].setText("Tostado Redondo");
           
            
            final TextField txt[]=new TextField[5];
            for(i=0;i<5;i++)
            {
                txt[i]=new TextField();
                txt[i].setLayoutX(250);
                txt[i].setLayoutY(40+40*i);
                txt[i].setText("54");  
                root2.getChildren().add(txt[i]);
            }                      
                   
            txt[1].setText("76");                                  
            txt[2].setText("35");                                
            txt[3].setText("30");                                
            txt[4].setText("4");                               
            
            final TextField t[] =new TextField[5];
            for(i=0;i<5;i++)
            {
            t[i]=new TextField();
            t[i].setText("0");
            t[i].setLayoutX(400);
            t[i].setLayoutY(40+40*i); 
            root2.getChildren().add(t[i]);
            }            
                     
            final Label total0=new Label();
            total0.setText("Total");
            total0.setLayoutX(400);
            total0.setLayoutY(300);
            root2.getChildren().add(total0);
          
            final Label total1=new Label();
            total1.setText("");
            total1.setLayoutX(450);
            total1.setLayoutY(300);
            root2.getChildren().add(total1);
            
            final Button reset = new Button();
            reset.setText("Reset");
            reset.setLayoutX(300);
            reset.setLayoutY(300);
            root2.getChildren().add(reset);
            
            final Button adicionales = new Button();
            adicionales.setText("Adicionales");
            adicionales.setLayoutX(300);
            adicionales.setLayoutY(350);
            root2.getChildren().add(adicionales);
            
            final Button adivuelta = new Button();
            adivuelta.setText("Volver");
            adivuelta.setLayoutX(350);
            adivuelta.setLayoutY(200);
            root.getChildren().add(adivuelta);
            
        btnPapas.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event)
            {
            total=Integer.parseInt(txtPb.getText());
            total=total+10;
            txtTotal.setText(Integer.toString(total));
            txtPb.setText(Integer.toString(total));
            papa=papa+1;
            etiPapa.setText(Integer.toString(papa));
            btnPapas.setStyle("-fx-base: #46e719");
            
            }
        });
        
        btnGas.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event)
            {
            total=Integer.parseInt(txtPb.getText());
            total=total+12;
            txtTotal.setText(Integer.toString(total));
            txtPb.setText(Integer.toString(total));
            gas=gas+1;
            etiGas.setText(Integer.toString(gas));
            btnGas.setStyle("-fx-base: #46e719");
            }
        });
        
        btnPostre.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event)
            {
            total=total+15;
            txtTotal.setText(Integer.toString(total));
            postre=postre+1;
            etiPostre.setText(Integer.toString(postre));
            btnPostre.setStyle("-fx-base: #46e719");
            }
        });
                
        btnDes.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event)
            {
            des=total/10;
            total=total-des;            
            txtTotal.setText(Integer.toString(total));
            btnDes.setStyle("-fx-base: #46e719");
            veces=true;
            btnDes.setDisable(veces);
            }
        });
        
        btnReset.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event)
            {
            papa=0;
            gas=0;
            postre=0;
            total=104;
            txtTotal.setText(Integer.toString(total));
            etiPapa.setText(Integer.toString(papa));
            etiGas.setText(Integer.toString(gas));
            etiPostre.setText(Integer.toString(postre));
            veces=false;
            btnDes.setDisable(veces);
            }
        });
        
        adivuelta.setOnAction(new EventHandler<ActionEvent>(){
            public void handle (ActionEvent event)
            {
            primaryStage.setScene(scene2);
            }
        });
        
        /*----------------------------------------------------------*/
            btn[0].setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
             int a,b,c,d,e,f;
             s=s+1;
             cant[0].setText(Integer.toString(s));
             cantsub=Integer.parseInt(txt[0].getText());
             t[0].setText(Integer.toString(cantsub*s));
             b=Integer.parseInt(t[0].getText()); 
             c=Integer.parseInt(t[1].getText()); 
             d=Integer.parseInt(t[2].getText()); 
             e=Integer.parseInt(t[3].getText());
             f=Integer.parseInt(t[4].getText()); 
             a=b+c+d+e+f;
             total1.setText(Integer.toString(a));
            }
        });
            btn[1].setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
             int a,b,c,d,e,f;
             s1=s1+1;
             cant[1].setText(Integer.toString(s1));
             cantsub=Integer.parseInt(txt[1].getText());
             t[1].setText(Integer.toString(cantsub*s1));
             b=Integer.parseInt(t[0].getText()); 
             c=Integer.parseInt(t[1].getText()); 
             d=Integer.parseInt(t[2].getText()); 
             e=Integer.parseInt(t[3].getText());
             f=Integer.parseInt(t[4].getText()); 
             a=b+c+d+e+f;
             total1.setText(Integer.toString(a));
            }
        });
            btn[2].setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
             int a,b,c,d,e,f;
             s2=s2+1;
             cant[2].setText(Integer.toString(s2));
             cantsub=Integer.parseInt(txt[2].getText());
             t[2].setText(Integer.toString(cantsub*s2));
             b=Integer.parseInt(t[0].getText()); 
             c=Integer.parseInt(t[1].getText()); 
             d=Integer.parseInt(t[2].getText()); 
             e=Integer.parseInt(t[3].getText());
             f=Integer.parseInt(t[4].getText()); 
             a=b+c+d+e+f;
             total1.setText(Integer.toString(a));
            }
        });
              btn[3].setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
             int a,b,c,d,e,f;
             s3=s3+1;
             cant[3].setText(Integer.toString(s3));
             cantsub=Integer.parseInt(txt[3].getText());
             t[3].setText(Integer.toString(cantsub*s3));
             b=Integer.parseInt(t[0].getText()); 
             c=Integer.parseInt(t[1].getText()); 
             d=Integer.parseInt(t[2].getText()); 
             e=Integer.parseInt(t[3].getText());
             f=Integer.parseInt(t[4].getText()); 
             a=b+c+d+e+f;
             total1.setText(Integer.toString(a));
            }
        });
                btn[4].setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
             int a,b,c,d,e,f;
             s4=s4+1;
             cant[4].setText(Integer.toString(s4));
             cantsub=Integer.parseInt(txt[4].getText());
             t[4].setText(Integer.toString(cantsub*s4));
             b=Integer.parseInt(t[0].getText()); 
             c=Integer.parseInt(t[1].getText()); 
             d=Integer.parseInt(t[2].getText()); 
             e=Integer.parseInt(t[3].getText());
             f=Integer.parseInt(t[4].getText()); 
             a=b+c+d+e+f;
             total1.setText(Integer.toString(a));
            }
        });
            
            reset.setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
             s=0;s1=0;s2=0;s3=0;s4=0;
             for(c=0;c<5;c++)
             {
             cant[c].setText(Integer.toString(s));
             cantsub=0;
             t[c].setText("0");
             total1.setText("0");
            }}
        });
               
           adicionales.setOnAction(new EventHandler<ActionEvent>(){
            
                @Override
            public void handle (ActionEvent event)
            {
            
            primaryStage.setScene(scene); 
            cambio=total1.getText();
            txtPb.setText(cambio);
            }});
              
        root.getChildren().add(btnPapas);
        root.getChildren().add(btnGas);
        root.getChildren().add(btnPostre);
        root.getChildren().add(txtPb);
        root.getChildren().add(etiPb);
        root.getChildren().add(etiTotal);
        root.getChildren().add(txtTotal);
        root.getChildren().add(btnDes);
        root.getChildren().add(etiPapa);
        root.getChildren().add(etiGas);
        root.getChildren().add(etiPostre);
        root.getChildren().add(btnReset);
        
       
    
        
        primaryStage.setScene(scene);
        primaryStage.setScene(scene2);
        primaryStage.show();       
    }   
}
