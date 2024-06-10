public class UserValidation implements UserValidationInterface {
    @Override
    public boolean validateUser(String websiteUrl, Role role) {

        if (role.equals(Role.ADMIN)
                && websiteUrl.contains(Role.ADMIN.getAccessToSiteStartedWith())) {
            Printer.printAnswers();
            return true;
        } else if (role.equals(Role.USER)
                && websiteUrl.contains(Role.USER.getAccessToSiteStartedWith())) {
            Printer.printAnswers();
            return true;
        } else if (role.equals(Role.TEEN)
                && websiteUrl.contains(Role.TEEN.getAccessToSiteStartedWith())) {
            Printer.printAnswers();
            return true;
        } else {
            Printer.printAnswer();
            return false;
        }
    }
}
