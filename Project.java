import java.util.Scanner;
    public class Project {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            String[] Dad = new String[2];
            String[] Mom = new String[2];
            String[][] Child = new String[4][2];
            int[] G = new int[4];
            int[] Count = new int[4];
            int[] Per = new int[4];
            System.out.println("กรุณาใส่ข้อมูลกรุ๊ปเลือดดังนี้");
            System.out.println("กรุ๊ป A พันธุ์แท้ : AA");
            System.out.println("กรุ๊ป A พันธุ์ทาง : Ao");
            System.out.println("กรุ๊ป B พันธุ์แท้ : BB");
            System.out.println("กรุ๊ป A พันธุ์ทาง : Bo");
            System.out.println("กรุ๊ป O พันธุ์แท้ : oo");
            System.out.println("กรุ๊ป AB พันธุ์แท้ : AB");
            System.out.println("*หมายเหตุ กรุณาใส่ทีละ 1 แอลลีล");
            System.out.println("*หมายเหตุ2 กรุณาใช้ 'o' เท่านั้น");
            System.out.println("What Dad's Blood type??");
            for(int i = 0;i < Dad.length;i++) {
                System.out.print(" ตัวที่"+(i+1)+" : ");
                Dad[i] = sc.next();
            }
            System.out.println("What Mom's Blood type?");
            for(int i = 0;i < Mom.length;i++) {
                System.out.print(" ตัวที่"+(i+1)+" : ");
                Mom[i] = sc.next();
            }
            Child[0][0] = Dad[0];
            Child[0][1] = Mom[0];
            Child[1][0] = Dad[0];
            Child[1][1] = Mom[1];
            Child[2][0] = Dad[1];
            Child[2][1] = Mom[0];
            Child[3][0] = Dad[1];
            Child[3][1] = Mom[1];
            for(int i = 0;i < 4;i++){
                for(int j = 0;j < 2;j++){
                    switch (Child[i][j]) {
                        case "A" :
                            G[i] = G[i] + 1;
                            break;
                        case "B" :
                            G[i] = G[i] + 2;
                            break;
                        case "o" :
                            G[i] = G[i] + 4;
                            break;
                    }
                }
            }
            for(int i = 0;i < 4;i++){
                if(G[i] == 2 || G[i] == 5)
                    Count[0] = Count[0] + 1;
                else if(G[i] == 4 || G[i] == 6)
                    Count[1] = Count[1] + 1;
                else if(G[i] == 8)
                    Count[2] = Count[2] + 1;
                else if(G[i] == 3)
                    Count[3] = Count[3] + 1;
            }
            for(int i = 0;i < 4;i++){
                Per[i] = (Count[i] * 100) /4;
            }
            System.out.println("โอกาสที่ลูกจะเป็นกรุ๊ป A คือ " + Per[0] + "%");
            System.out.println("โอกาสที่ลูกจะเป็นกรุ๊ป B คือ " + Per[1] + "%");
            System.out.println("โอกาสที่ลูกจะเป็นกรุ๊ป O คือ " + Per[2] + "%");
            System.out.println("โอกาสที่ลูกจะเป็นกรุ๊ป AB คือ " + Per[3] + "%");
        }
    }