/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package facebook;


import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Dialog;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.MenuButton;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Background;
import javafx.scene.layout.Border;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.shape.Line;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author hp
 */
public class Facebook extends Application {
    
    @Override
    public void start(Stage primaryStage) {
       
        Pane root = new Pane();
        //Rectangle r=new Rectangle(0, 0, 1200, 200);
        Rectangle r=new Rectangle(0, 0, 1400, 100);
        r.setFill(Color.rgb(59, 89, 153));
        r.setStrokeWidth(1);
        r.setStroke(Color.WHITE);
        Text tf=new Text(180, 70, "facebook");
        tf.setFont(Font.font("Constantia", 45));
        
        tf.setFill(Color.WHITE);
        tf.setStrokeWidth(1);
        tf.setStroke(Color.WHITE);
        Text l1=new Text("Email or Phone");
        Text l2=new Text("Password");
        TextField tf1=new TextField();
        PasswordField tf2=new PasswordField();
       // TextField tf2=new TextField();
        l1.setFill(Color.WHITE);
        l1.setStroke(Color.WHITE);
        l1.setStrokeWidth(1);
        l1.setLayoutX(700);
        l1.setLayoutY(40);
        l1.setFont(Font.font(12));
        l2.setFill(Color.WHITE);
        l2.setStroke(Color.WHITE);
        l2.setStrokeWidth(1);
        l2.setLayoutX(900);
        l2.setLayoutY(40);
        l2.setFont(Font.font(12));
        tf1.setLayoutX(700);
        tf1.setLayoutY(45);
        tf1.setMinSize(50, 20);
        tf2.setLayoutX(900);
        tf2.setLayoutY(45);
        tf2.setMinSize(50, 20);
        Hyperlink b=new Hyperlink("Log In");
        b.setFont(Font.font(12));
//        b.setScaleX(1000);
//        b.setScaleY(45);
        b.minHeight(10);
        b.minWidth(5);
        b.autosize();
        b.applyCss();
        
       b.setTextAlignment(TextAlignment.CENTER);
       b.setStyle("-fx-background-color: RoyalBlue");
       b.setTextFill(Color.WHITE);
       b.setLayoutX(1080);
       b.setLayoutY(45);
       b.setShape(r);
       Text login=new Text("Recent logins");
       Text Create=new Text("Create a new account");
       login.setFont(Font.font("Latin", 45));
       Create.setFont(Font.font("Latin", 45));
       login.setX(180);
       login.setY(170);
       login.setStrokeWidth(2);
       Create.setX(700);
       Create.setY(170);
       Create.setStrokeWidth(2);
        Text l3=new Text("Click your picture or add an account.");
       Text l4=new Text("It's free and always will be.");
       l3.setFont(Font.font("Footlight MT", 20));
       l4.setFont(Font.font("Footlight MT", 20));
       l3.setX(180);
       l3.setY(210);
       l3.setStrokeWidth(0);
       l4.setX(700);
       l4.setY(210);
       l4.setStrokeWidth(0);
       TextField tf4=new TextField();
       TextField tf5=new TextField();
         TextField tf6=new TextField();
        TextField tf7=new TextField();
       tf4.setMinSize(120, 40);
       tf4.setPromptText("First Name");
       tf5.setMinSize(120, 40);
        tf5.setPromptText("Surname");
       tf4.setLayoutX(700);
        tf6.setPromptText("Mobile number or Email Address");
       tf4.setLayoutY(230);
       tf5.setLayoutX(900);
       tf5.setLayoutY(230);
        tf7.setPromptText("New password");
       tf6.setMinSize(350, 40);
       tf7.setMinSize(350, 40);
       tf6.setLayoutX(700);
       tf6.setLayoutY(280);
       tf7.setLayoutX(700);
       tf7.setLayoutY(330);
        ChoiceBox<Integer> ch=new ChoiceBox<>();
        ch.getItems().addAll(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20,21,22,23,24,25,26,27,28,29,30,31);
        ch.setValue(13);
         ChoiceBox<Integer> year=new ChoiceBox<>();
        year.getItems().addAll(1905,1906,1907,1908,1909,1910,1911,1912,1913,1914,1915,1916,1917,1918,1919,1920,1921,1922,1923,1924,1925,1926,1927,1928,1929,1930,1931,1932,1933,1934,1935,1936,1937,1938,1939,1940,1941,1942,1943,1944,1945,1946,1947,1948,1949,1950,1951,1952,1953,1954,1955,1956,1957,1958,1959,1960,1961,1962,1963,1964,1965,1965,1966,1967,1968,1969,1970,1971,1972,1973,1974,1975,1976,1977,1978,1979,1980,1982,1982,1983,1984,1985,1986,1987,1988,1989,1990,1991,1992,1993,1994,1995,1996,1997,1998,1999,2000,2001,2002,2003,2004,2005,2006,2007,2008,2009,2010,2011,2012,2013,2014,2015,2016,2017,2018,2019);
        year.setValue(2010);
        ChoiceBox<String> month=new ChoiceBox<>();
        month.getItems().addAll("Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec");
        month.setValue("Feb");
        Text t10=new Text("Birthday");
        t10.setStrokeWidth(1);
        
        t10.setX(700);
        t10.setY(400);
        t10.setFont(Font.font("Courier", 25));
        ch.setLayoutX(700);
        ch.setLayoutY(420);
        ch.setMinSize(10, 15);
        month.setLayoutX(745);
        month.setMinSize(10, 15);
        month.setLayoutY(420);
        
        year.setLayoutX(800);
        year.setMinSize(10, 15);
        year.setLayoutY(420);
        Circle c1=new Circle(720, 480, 6);
          Circle c2=new Circle(795, 480, 6);
//        MenuButton mb=new MenuButton();
//        mb.setContextMenu(C);
//       
       Text t15=new Text(730, 486, "Female");
        Text t16=new Text(805, 486, "Male");
        t15.setFont(Font.font(18));
          t16.setFont(Font.font(18));
       c1.setFill(Color.WHITE);
       c1.setStroke(Color.GRAY);
       c2.setFill(Color.WHITE);
       c2.setStroke(Color.GRAY);
       Circle c3=new Circle();
       
       c1.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
           // Circle c3=new Circle(722, 482, 2, Color.BLACK);
            c3.setCenterX(720);
            c3.setCenterY(480);
            c3.setRadius(4);
            c3.setFill(Color.BLACK);
            c2.setFill(Color.WHITE);
            }
        });
        c2.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
          // Circle c3=new Circle(797, 482, 2, Color.BLACK);
           c3.setCenterX(795);
            c3.setCenterY(480);
            c3.setRadius(4);
            c3.setFill(Color.BLACK);  
          c1.setFill(Color.WHITE);
            }
        });
            t15.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
           // Circle c3=new Circle(722, 482, 2, Color.BLACK);
            c3.setCenterX(720);
            c3.setCenterY(480);
            c3.setRadius(4);
            c3.setFill(Color.BLACK);
            c2.setFill(Color.WHITE);
            }
        });
        t16.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent event) {
         //       throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
           
          // Circle c3=new Circle(797, 482, 2, Color.BLACK);
           c3.setCenterX(795);
            c3.setCenterY(480);
            c3.setRadius(4);
            c3.setFill(Color.BLACK);  
          c1.setFill(Color.WHITE);
            }
        });
        Text t20=new Text(700, 510, "By clicking Sign Up, you agree to our Terms,Data Policy and.");
        Text t21=new Text(700, 525, "Cookie Policy. You may receive SMS notifications from us and");
        Text t22=new Text(700, 540, "can opt out at any time.");
       
          // t20.wrappingWidthProperty();
           t20.setFont(Font.font(10));
           t20.setFill(Color.GRAY);
           t20.setTextAlignment(TextAlignment.JUSTIFY);
           t21.setFont(Font.font(10));
           t21.setFill(Color.GRAY);
           t21.setTextAlignment(TextAlignment.JUSTIFY);
           t22.setFont(Font.font(10));
           
           t22.setFill(Color.GRAY);
           t22.setTextAlignment(TextAlignment.JUSTIFY);
           Hyperlink b2=new Hyperlink("Sign Up");
           b2.setTextAlignment(TextAlignment.RIGHT);
           b2.setLayoutX(700);
           b2.setLayoutY(570);
           b2.setStyle("-fx-background-color: DARKGREEN");
           b2.setTextFill(Color.WHITE);
           b2.setFont(Font.font("Latin", 20));
           b2.setMinSize(180, 40);
           Line l10=new Line(700, 620, 1000, 620);
           l10.setFill(Color.LIGHTSLATEGRAY);
           Image i=new Image("Images/hassan.jpg");
           ImageView im=new ImageView();
           im.setImage(i);
           im.setFitHeight(130);
           im.setFitWidth(100);
           im.setLayoutX(180);
           im.setLayoutY(270);
           im.autosize();
           
           Hyperlink b3=new Hyperlink("Hassan", im);
           b3.setLayoutX(180);
           b3.setLayoutY(270);
           b3.setAlignment(Pos.BASELINE_CENTER);
           b3.setMinSize(100, 150);
           b3.setFont(Font.font(20));
            Image i1=new Image("Images/add.jpg");
           ImageView im1=new ImageView();
           im1.setImage(i1);
           im1.setFitHeight(130);
           im1.setFitWidth(100);
           im1.setLayoutX(400);
           im1.setLayoutY(270);
           im1.autosize();
           
           Hyperlink b4=new Hyperlink("ADD", im1);
           b4.setLayoutX(400);
           b4.setLayoutY(270);
           b4.setAlignment(Pos.BASELINE_CENTER);
           b4.setMinSize(100, 150);
           b4.setFont(Font.font(20));
           Hyperlink h1=new Hyperlink("Forgotton account?");
           h1.setTextFill(Color.WHITE);
           h1.setLayoutX(900);
           h1.setLayoutY(70);
          Hyperlink h2=new Hyperlink("Why do I need to provide my");
           h2.setTextFill(Color.ROYALBLUE);
           h2.setLayoutX(870);
           h2.setLayoutY(420);
           h2.setFont(Font.font(10));
           Hyperlink h3=new Hyperlink("Date Of Birth");
           h3.setTextFill(Color.ROYALBLUE);
           h3.setLayoutX(870);
           h3.setLayoutY(430);
            h3.setFont(Font.font(10));
//t22.setFill(Color.);
        root.getChildren().addAll(r,tf,l1,l2,tf1,tf2,b,Create,login,l3,l4,tf5,tf6,tf7,tf4,t10,ch,month,year,c1,c2,c3,t15,t16,t20,t21,t22,l10,b2,b3,b4,h1,h2,h3);
        
        Scene scene = new Scene(root, 1400,800);
        
        primaryStage.setTitle("FACEBOOK");
        primaryStage.setScene(scene);
        primaryStage.show();
        c1.requestFocus();
        c2.requestFocus();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
