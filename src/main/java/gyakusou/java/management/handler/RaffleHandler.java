// 프로젝트 : 취미 커뮤니티 만들기.
//
// v10 handler.RaffleHandler

package gyakusou.java.management.handler;

import java.sql.Date;
import java.util.Scanner;
import gyakusou.java.management.domain.Raffle;
import gyakusou.java.management.util.ArrayList;;

public class RaffleHandler {

  ArrayList<Raffle> raffleList;
  Scanner input;
  
  public RaffleHandler(Scanner input) {
    this.input = input;
    raffleList = new ArrayList<>();
  }
  
  public RaffleHandler(Scanner input, int capacity) {
    this.input = input;
    raffleList = new ArrayList<>(capacity);
  }
  
  public void listRaffle() {
    Raffle[] arr = new Raffle[this.raffleList.size()];
    
    this.raffleList.toArray(arr);
    
    for (Raffle r : arr) {
      System.out.printf("%s, %s, %s, %s, %d, %s\n", 
          r.getNo(), r.getBrand(), r.getShoeName(), 
          r.getReleaseDate(), r.getPrice(), r.getPlaceSale());
    }
  }
  
  public void addRaffle() {

    Raffle raffle = new Raffle();

    System.out.print("번호? ");
    raffle.setNo(input.nextInt());

    input.nextLine(); 

    System.out.print("브랜드명? ");
    raffle.setBrand(input.nextLine());

    System.out.print("신발명? ");
    raffle.setShoeName(input.nextLine());

    System.out.print("출시일? ");
    raffle.setReleaseDate(Date.valueOf(input.next()));
    input.nextLine();

    System.out.print("가격? ");
    raffle.setPrice(input.nextInt());
    input.nextLine();

    System.out.print("발매장소? ");
    raffle.setPlaceSale(input.nextLine());

    raffleList.add(raffle);
    System.out.println("저장하였습니다.");
  }

  
  public void detailRaffle( ) {
    System.out.print("게시물 번호? ");
    int index = input.nextInt();
    input.nextLine();

    Raffle raffle = this.raffleList.get(index);
    
    if (raffle == null) {
      System.out.println("게시물 번호가 유효하지 않습니다.");
      return;
    }

    System.out.printf("번호: %d\n", raffle.getNo());
    System.out.printf("브랜드명: %s\n", raffle.getBrand());
    System.out.printf("신발명: %s\n", raffle.getShoeName());
    System.out.printf("출시일: %s\n", raffle.getReleaseDate());
    System.out.printf("가격: %d\n", raffle.getPrice());
    System.out.printf("발매장소: %s\n", raffle.getPlaceSale());
  }

}