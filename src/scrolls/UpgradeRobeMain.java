package scrolls;

import robe.BlueRobe;

import javax.sound.midi.Soundbank;
import java.lang.reflect.WildcardType;
import java.sql.SQLOutput;
import java.util.Scanner;

public class UpgradeRobeMain {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        BlueRobe blueRobe = new BlueRobe();
        while (true) {
            System.out.println("[1]파란색 가운 강화 [2]장비 조회 [3]종료");
            System.out.print(">> ");
            if (sc.hasNextInt()) {


                switch (sc.nextInt()) {
                    case 1:
                        UpgradeRobe(blueRobe);
                        break;
                    case 2:
                        System.out.println(blueRobe);
                        break;
                    case 3:
                        break;
                    default:
                        System.out.println("잘못 입력 하셨습니다.");
                        break;
                }
            } else {
                System.out.println("잘못 입력 하셨습니다.");
                sc.nextLine();
            }
        }
    }

    private static void UpgradeRobe(BlueRobe blueRobe) {
        while (true) {
            if (blueRobe.getUpgrade() == 0) return;
            System.out.println("[1]100% [2]60% [3]10% [4]BACK");
            System.out.print(">> ");
            if (sc.hasNextInt()) {
                int scroll = sc.nextInt();
                if (scroll > 0 && scroll < 5) {
                    if (scroll == 4) return;
                    boolean result = scrollResult(scroll);
                    System.out.println("[1]STR [2]DEX [3]INT [4]LUK");
                    System.out.print(">> ");
                    upgradeItem(sc.nextInt(), scroll ,result, blueRobe);
                } else {
                    System.out.println("잘못 입력 하셨습니다");
                    continue;
                }
            } else {
                System.out.println("잘못 입력 하셨습니다.");
                sc.nextLine();
                continue;
            }
        }
    }

    private static void upgradeItem(int sel, int stat, boolean result, BlueRobe blueRobe) {
        if (stat == 3) stat = 5;
        if (sel == 1) {
            blueRobe.setStr(result ? blueRobe.getStr() + stat : blueRobe.getStr());
            blueRobe.setUpPlus(result ? blueRobe.getUpPlus() + 1 : blueRobe.getUpPlus());
            blueRobe.setUpgrade(blueRobe.getUpgrade() - 1);
            System.out.println(result ? "성공!!!!!!!!!!" : "실패!!!!!!!!");

        } else if (sel == 2) {
            blueRobe.setDex(result ? blueRobe.getDex() + stat : blueRobe.getDex());
            blueRobe.setUpPlus(result ? blueRobe.getUpPlus() + 1 : blueRobe.getUpPlus());
            blueRobe.setUpgrade(blueRobe.getUpgrade() - 1);
            System.out.println(result ? "성공!!!!!!!!!!" : "실패!!!!!!!!");

        } else if (sel == 3) {
            blueRobe.setIntel(result ? blueRobe.getIntel() + stat : blueRobe.getIntel());
            blueRobe.setUpPlus(result ? blueRobe.getUpPlus() + 1 : blueRobe.getUpPlus());
            blueRobe.setUpgrade(blueRobe.getUpgrade() - 1);
            System.out.println(result ? "성공!!!!!!!!!!" : "실패!!!!!!!!");

        } else if (sel == 4) {
            blueRobe.setLuk(result ? blueRobe.getLuk() + stat : blueRobe.getLuk());
            blueRobe.setUpPlus(result ? blueRobe.getUpPlus() + 1 : blueRobe.getUpPlus());
            blueRobe.setUpgrade(blueRobe.getUpgrade() - 1);
            System.out.println(result ? "성공!!!!!!!!!!" : "실패!!!!!!!!");
        }

    }

    private static boolean scrollResult (int scroll){
        Scroll scrolls = new Scroll();
        boolean result;

        if (scroll == 1) result = scrolls.isHunderedScroll();
        else if (scroll == 2) result = scrolls.isSixtyScroll();
        else result = scrolls.isTenScroll();
        return result;
    }
}