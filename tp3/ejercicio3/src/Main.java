public class Main {

    public static void main(String[] args) {
        Alarma alarmaNormal = new Alarma();
        AlarmaLuminosa alarmaLuminosa = new AlarmaLuminosa();

        alarmaNormal.setVidrioRoto(true);
        alarmaNormal.comprobar();

        alarmaLuminosa.comprobar();
    }
}
