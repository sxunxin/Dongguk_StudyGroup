����   B Z
      java/lang/Object <init> ()V  java/util/Scanner	 
     java/lang/System in Ljava/io/InputStream;
     (Ljava/io/InputStream;)V	 
    out Ljava/io/PrintStream;  %음식 이름을 입력해주세요: 
      java/io/PrintStream print (Ljava/lang/String;)V
     ! nextLine ()Ljava/lang/String; # (음식의 가격을 입력해주세요: 
  % & ' nextInt ()I ) (음식의 수량을 입력해주세요:    + , - makeConcatWithConstants '(Ljava/lang/String;I)Ljava/lang/String;
  / 0  println  2 , 3 (I)Ljava/lang/String; 5 No_3 Code LineNumberTable LocalVariableTable this LNo_3; main ([Ljava/lang/String;)V args [Ljava/lang/String; scanner Ljava/util/Scanner; foodName Ljava/lang/String; 	foodPrice I foodQuantitiy 
totalPrice 
SourceFile 	No_3.java BootstrapMethods K   개를 주문하셨습니다. M 총 가격은 원입니다. O
 P Q R , S $java/lang/invoke/StringConcatFactory �(Ljava/lang/invoke/MethodHandles$Lookup;Ljava/lang/String;Ljava/lang/invoke/MethodType;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/invoke/CallSite; InnerClasses V %java/lang/invoke/MethodHandles$Lookup X java/lang/invoke/MethodHandles Lookup ! 4           6   /     *� �    7       	 8        9 :   	 ; <  6   �     U� Y� 	� L� � +� M� "� +� $>� (� +� $6h6� ,� *  � .� � 1  � .�    7   .              %  -  3  9  G  T  8   >    U = >    J ? @   = A B  % 0 C D  3 " E D  9  F D   G    H I     N  J N  L T   
  U W Y 