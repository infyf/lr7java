import java.util.ArrayList;
import java.util.Collections;

class MyItem {
    private int value;

    public MyItem(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return Integer.toString(value);
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<MyItem> myArrayList = new ArrayList<>();
        myArrayList.add(new MyItem(5));
        myArrayList.add(new MyItem(3));
        myArrayList.add(new MyItem(8));
        myArrayList.add(new MyItem(1));

        System.out.println("���������� ������� ��������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }

        Collections.sort(myArrayList, (obj1, obj2) -> Integer.compare(obj1.getValue(), obj2.getValue()));

        System.out.println("\n³����������� ������� ��������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }

       // ����� �������� �� ���������
int searchValue = 1;
for (int i = 0; i < myArrayList.size(); i++) {
    if (myArrayList.get(i).getValue() == searchValue) {
        System.out.println("������� � ��������� " + searchValue + " ����������� �� ������: " + i);
        break; // ���� ������� ��������, ����� ��������� �����
    }
}

        if (myArrayList.size() > 2) {
            MyItem itemAtIndex = myArrayList.get(2);
            System.out.println("������� �� ������ 2: " + itemAtIndex);
        } else {
            System.out.println("��������� ������ �������, ��� �� ������ �������� �� ��� ��������.");
        }

        // ���� �������� �������� ��������
        int indexToChange = 2;
        int newValue = 15;
        if (indexToChange >= 0 && indexToChange < myArrayList.size()) {
            myArrayList.get(indexToChange).setValue(newValue);
            System.out.println("\n�������� �������� �������� ������ �� " + newValue);
        } else {
            System.out.println("\n��������� ������ ��������, ��� �� ������ �������� �� ��� ��������.");
        }

        // ��������� ����� �� �������� ��������
        System.out.println("\n����� ��������: " + myArrayList.toString());

        // ��������� ��������MyItem itemToRemove = myArrayList.get(1);
       MyItem itemToRemove = myArrayList.get(1);
        if (myArrayList.contains(itemToRemove)) {
            myArrayList.remove(itemToRemove);
            System.out.println("������� " + itemToRemove + " �������� � ��������.");
        } else {
            System.out.println("������� " + itemToRemove + " �� �������� � ��������.");
        }

        System.out.println("�������� ��������: " + myArrayList.toString());
        
        // 6
int targetValue = 1;

int count = 0;


for (MyItem item : myArrayList) {
    if (item.getValue() == targetValue) {
        count++; 
    }
}


System.out.println("ʳ������ �������� � ��������� " + targetValue + ": " + count);

 // 7 ��������� ��ﳿ ��������
        ArrayList<MyItem> copyArrayList = new ArrayList<>(myArrayList);
        System.out.println("\n���� ��������:");
        for (MyItem obj : copyArrayList) {
            System.out.println(obj);
        }
        
    }
    
    
}
˳����� ����: �������� 8
public class Main {
    public static void main(String[] args) {
        ArrayList<MyItem> myArrayList = new ArrayList<>();
        myArrayList.add(new MyItem(5));
        myArrayList.add(new MyItem(3));
        myArrayList.add(new MyItem(8));
        myArrayList.add(new MyItem(1));

        System.out.println("���������� ������� ��������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }

       
        MyItem maxItem = findMaxItem(myArrayList);
        System.out.println("\n������� � ������������ ���������: " + maxItem);

    }

    // ����� ��� ����������� �������� � ������������ ��������� ����
    public static MyItem findMaxItem(ArrayList<MyItem> list) {
        if (list == null || list.isEmpty()) {
            return null; // �������� �� ������ ������
        }

        MyItem maxItem = list.get(0);
        for (int i = 1; i < list.size(); i++) {
            MyItem currentItem = list.get(i);
            if (currentItem.getValue() > maxItem.getValue()) {
                maxItem = currentItem; // ��������� ������������ �������, ���� �������� ������� � ������ ���������
            }
        }

        return maxItem;
    }
}

˳����� ����: �������� 9

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class MyItem {
    private int value;
    private String name;

    public MyItem(int value, String name) {
        this.value = value;
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Value: " + value + ", Name: " + name;
    }
}

class SortByName implements Comparator<MyItem> {
    @Override
    public int compare(MyItem o1, MyItem o2) {
        return o1.getName().compareTo(o2.getName());
    }
}

public class Main {
    public static void main(String[] args) {
        ArrayList<MyItem> myArrayList = new ArrayList<>();
        myArrayList.add(new MyItem(5, "E"));
        myArrayList.add(new MyItem(3, "C"));
        myArrayList.add(new MyItem(8, "H"));
        myArrayList.add(new MyItem(1, "A"));

        System.out.println("���������� ������� ��������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }

        // ���������� �� ������ �� ��������� ����� SortByName
        Collections.sort(myArrayList, new SortByName());

        System.out.println("\n���������� �� ������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }
        // ���������� �� ������ �� ��������� ������-������
        Collections.sort(myArrayList, Comparator.comparing(MyItem::getName));

        System.out.println("\n���������� �� ������ �� ��������� ������-������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }
        
        
        System.out.println("==========Comparator======:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }

        // ���������� �� ������ �� ���������
        Collections.sort(myArrayList, Comparator.comparing(MyItem::getName).thenComparing(MyItem::getValue));

        System.out.println("\n���������� �� ������ �� ���������:");
        for (MyItem obj : myArrayList) {
            System.out.println(obj);
        }
    }
    
}
