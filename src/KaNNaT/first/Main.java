package KaNNaT.first;

public class Main {

    public static void main(String[] args) {
        // Task # 1
        int clientOS = 0;
        if (clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else {
            if (clientOS == 1) {
                System.out.println("���������� ������ ���������� ��� Android �� ������");
            }
        }

        // Task # 2
        int clientDeviceYear = 2013;
        if (clientDeviceYear >= 2015 && clientOS == 0) {
            System.out.println("���������� ������ ���������� ��� iOS �� ������");
        } else if (clientDeviceYear >= 2015 && clientOS == 1) {
            System.out.println("���������� ������ ���������� ��� Android �� ������");
        } else if (clientDeviceYear < 2015 && clientOS == 0) {
            System.out.println("���������� ����������� ������ ���������� ��� iOS �� ������");
        } else if (clientDeviceYear < 2015 && clientOS == 1) {
            System.out.println("���������� ����������� ������ ���������� ��� Android �� ������");
        }

        // Task # 3
        int yaer = 2020;
        if (yaer % 4 == 0 && yaer % 100 != 0 || yaer % 400 == 0) {
            System.out.println(yaer + " ��� �������� ����������");
        } else {
            System.out.println(yaer + " ��� �� �������� ����������");
        }

        // Task # 4
        int deliveryDistance = 95;
        if (deliveryDistance <= 20) {
            System.out.println("����������� ����: 1");
        } else if (deliveryDistance > 20 && deliveryDistance <= 60) {
            System.out.println("����������� ����: 2");
        } else if (deliveryDistance > 60 && deliveryDistance <= 100) {
            System.out.println("����������� ����: 3");
        } else if (deliveryDistance > 100) {
            System.out.println("�������� �� ��������������, �������� ��� ���� �������");
        }

        // Task # 5
        int monthNumber = 12;
        switch (monthNumber) {
            case 1:
                System.out.println("������. ����");
                break;
            case 2:
                System.out.println("�������. ����");
                break;
            case 3:
                System.out.println("����. �����");
                break;
            case 4:
                System.out.println("������. �����");
                break;
            case 5:
                System.out.println("���. �����");
                break;
            case 6:
                System.out.println("����. ����");
                break;
            case 7:
                System.out.println("����. ����");
                break;
            case 8:
                System.out.println("������. ����");
                break;
            case 9:
                System.out.println("��������. �����");
                break;
            case 10:
                System.out.println("�������. �����");
                break;
            case 11:
                System.out.println("������. �����");
                break;
            case 12:
                System.out.println("�������. ����");
                break;
            default:
                System.out.println("������ ������ �� ����������");
        }



    }
}
