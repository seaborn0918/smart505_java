package Quiz;


import java.util.*;

public class Quiz {
  static Scanner sc = new Scanner(System.in);

  public static void quiz01() {

    Vector<Integer> numbers = new Vector<>();

    System.out.println("입력");
    for (int i = 0; i < 5; i++) {
      numbers.add(sc.nextInt());
    }

    int max = 0;
    for (int i = 0; i < numbers.size(); i++) {
      if (numbers.get(i) > max) {
        max = numbers.get(i);
      }
    }

    System.out.println("가장 큰 수는 " + max);

  }

  public static void quiz02() {
    ArrayList<String> grade = new ArrayList<>();

    System.out.println("빈 칸으로 분리하여 5개의 학점 입력");
    for (int i = 0; i < 5; i++) {
      grade.add(sc.next());
    }

    for (int i = 0; i < 5; i++) {
      if (grade.get(i).equals("A")) {
        System.out.println(4.0);
      }
    }


  }

  public static void quiz03() {
    Map<String, Integer> menu = new HashMap<String, Integer>();

    menu.put("에스프레소", 2000);
    menu.put("아메리카노", 2500);
    menu.put("카푸치노", 3000);
    menu.put("카페라떼", 3500);

    Set<String> menuKey = menu.keySet();
    Iterator<String> menuKeyIter = menuKey.iterator();

    while (menuKeyIter.hasNext()) {
      String key = menuKeyIter.next();
      System.out.println(key);
    }

    while (true) {
      System.out.println("에스프레소, 아메리카노, 카푸치노, 카페라떼 있습니다.");
      System.out.println("주문 >> ");
      String order = sc.next();
      if (order.equals("그만")) {
        break;
      }

//      Set<String> menuKey = menu.keySet();
//      Iterator<String> menuKeyIter = menuKey.iterator();
//
//      while (menuKeyIter.hasNext()) {
//        String key = menuKeyIter.next();
//        int i;
//        for (i = 0; i < menu.size(); i++) {
//          if (order.equals(key)) {
//            System.out.println(menu.get(i));
//          }
//        }
//        if (i == menu.size()) {
//          System.out.println("그런 메뉴 없습니다.");
//        }
//      }

    }
  }


  public static void quiz04() {
    Vector<Integer> years = new Vector<>();
    for (int i = 0; i < 10; i++) {
      years.add(2000 + i);
    }

    Vector<Integer> height = new Vector<>();
    System.out.println("키 입력");
    for (int i = 0; i < years.size(); i++) {
      height.add(sc.nextInt());
    }

    Vector<Integer> grow = new Vector<>();
    for (int i = 0; i < years.size(); i++) {
      int first = height.get(i);
      if ((i + 1) == 10) break;
      int second = height.get(i + 1);
      grow.add(second - first);
    }

    System.out.println();

    int maxGrowth = 0;
    int maxYear = 0;
    for (int i = 0; i < grow.size(); i++) {
      if (grow.get(i) > maxGrowth) {
        maxGrowth = grow.get(i);
        maxYear = years.get(i);
      }
    }
    System.out.println("가장 키가 많이 자란 연도는 " + maxYear + "년 " + maxGrowth + "cm");


    // 120 122 125 130 139 160 169 173 175 179
//    for (int i = 0; i < grow.size(); i++) {
//      System.out.print(grow.get(i) + " ");
//    }
  }

  public static void quiz05() {
    HashMap<String, Integer> nations = new HashMap<>();
    System.out.println("나라 이름과 인구를 5개 입력하세요");
    for (int i = 0; i < 5; i++) {
      System.out.println("나라 이름, 인구");
      nations.put(sc.next(), sc.nextInt());
    }

    Set<String> nationsKey = nations.keySet();
    Iterator<String> nationsKeyIter = nationsKey.iterator();
    int max = 0;
    String maxNation = null;
    while (nationsKeyIter.hasNext()) {
      String key = nationsKeyIter.next();
      int value = nations.get(key);
      if (value > max) {
        max = value;
        maxNation = key;
      }
    }
    System.out.println("제일 인구가 많은 나라는 : " + maxNation + " " + max);
  }

  public static void quiz06() {
    Map<String, Integer> customers = new HashMap<>();


    System.out.println("포인트 관리 프로그램입니다.");
    while (true) {
      System.out.println("이름과 포인트 입력>>");
      String name = sc.next();
      int point = sc.nextInt();
      if (name.equals("exit")) break;
      customers.put(name, point);

      Set<String> customersKey = customers.keySet();
      Iterator<String> itr = customersKey.iterator();
      int pointSum = 0;
      while (itr.hasNext()) {
        String key = itr.next();
        pointSum += customers.get(key);
        System.out.print("(" + key + "," + pointSum + ")");
      }
      System.out.println();
    }
  }

  public static void quiz07() {
    ArrayList<Location> al = new ArrayList<>();

    System.out.println("쥐가 이동한 위치 5개 입력");
    al.add(new Location(0, 0));
    for (int i = 0; i < 5; i++) {
      System.out.println(">>");
      al.add(new Location(sc.nextInt(), sc.nextInt()));
    }
    al.add(new Location(0, 0));

    for (int i = 0; i < al.size(); i++) {
      Location p = al.get(i - 1);
      double x = p.getX();
      double y = p.getY();

      Location p2 = al.get(i);
      double x2 = p2.getX();
      double y2 = p2.getY();

      double tx = x2 - x;
      double ty = y2 - y;


    }


  }


  public static void main(String[] args) {

//    quiz01(); o
//    quiz02();
//    quiz03();
//    quiz04(); o
//    quiz05(); o
//    quiz06();
//    quiz07();


  }
}
