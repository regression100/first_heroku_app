package maths.pure.arithmetic.ekub_and_ekuk;

import java.util.ArrayList;
import java.util.List;

public final class Ekub_Ekuk_Engine {
 //Shteynning algoritmi yoki ikkilik GCD algoritmi
 public static int gcdEkub(int a, int b)
 {

  if (a == 0)
   return b;
  if (b == 0)
   return a;

  int k;
  for (k = 0; ((a | b) & 1) == 0; ++k)
  {
   a >>= 1;
   b >>= 1;
  }

  while ((a & 1) == 0)
   a >>= 1;


  do {

   while ((b & 1) == 0)
    b >>= 1;

   if (a > b)
   {

    int temp = a;
    a = b;
    b = temp;
   }

   b = (b - a);
  } while (b != 0);

  return a << k;
 }
 //Shteynning algoritmi yoki ikkilik GCD algoritmi
//yordamida ikki sonning Ekukini hisoblash
 public static int gcdEkuk(int a, int b){
  return a*b/gcdEkub(a,b);
 }
 //Evklit algoritmi yordamida ikki sonning ekubini hisoblash
 public static int ekubEvklit(int a, int b){
  while (a != b)
  {
   if (a > b) a %= b;
   else b %= a;

   if (a == 0) a = b;
   if (b == 0) b = a;
  }
  return a;
 }
 //Evklit algoritmi yordamida ikki sonning ekukini hisoblash
 public static int ekukEvklit(int a, int b){
  return a*b/ekubEvklit(a,b);
 }

 //Evklit algoritmi yoordamida ikkitadan ortiq sonlarning ekubi ni hisoblash
 public static int multiEkubEvlit(List<Integer> list){
  int a = 0;
  while (list.size()>1) {
   List<Integer> list1=new ArrayList<>();
   for (int i = 1; i < list.size(); i++) {
    list1.add(ekubEvklit(list.get(i - 1), list.get(i)));
   }
   list = list1;
  }
  a=list.get(0);
  return a;
 }
 //Evklit algoritmi yoordamida ikkitadan ortiq sonlarning ekuk ni hisoblash

 public static int multiEkukEvklit(List<Integer> list){
  int a = 0;
  while (list.size()>1) {
   List<Integer> list1=new ArrayList<>();
   for (int i = 1; i < list.size(); i++) {
    list1.add(ekukEvklit(list.get(i - 1), list.get(i)));
   }
   list = list1;
  }
  a=list.get(0);
  return a;
 }
 //Shteynning algoritmi yoki ikkilik GCD algoritmi
//yordamida ikkitadan ortiq sonning Ekubini hisoblash
 public static int gcdMultiEkub(List<Integer> list){
  int a = 0;
  while (list.size()>1) {
   List<Integer> list1=new ArrayList<>();
   for (int i = 1; i < list.size(); i++) {
    list1.add(gcdEkub(list.get(i - 1), list.get(i)));
   }
   list = list1;
  }
  a=list.get(0);
  return a;
 }
 //Shteynning algoritmi yoki ikkilik GCD algoritmi
//yordamida ikkitadan ortiq sonning Ekukini hisoblash
 public static int gcdMultiEkuk(List<Integer> list){
  int a = 0;
  while (list.size()>1) {
   List<Integer> list1=new ArrayList<>();
   for (int i = 1; i < list.size(); i++) {
    list1.add(gcdEkuk(list.get(i - 1), list.get(i)));
   }
   list = list1;
  }
  a=list.get(0);
  return a;
 }
}