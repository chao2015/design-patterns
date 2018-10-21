package principle.LawOfDemeter.Install;

/**
 * Created by chao on 2018/10/21.
 */
public class Client {

    public static void main(String[] args) {
        InstallSoftware installSoftware = new InstallSoftware();
        installSoftware.installWizard(new Wizard());
    }
}
