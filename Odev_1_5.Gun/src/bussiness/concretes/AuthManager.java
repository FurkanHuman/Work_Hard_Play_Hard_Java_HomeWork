package bussiness.concretes;

import bussiness.abstracts.AuthService;
import bussiness.abstracts.UserService;
import core.adapters.abstracts.GAuthService;
import core.adapters.concretes.GServicesManagerAdaptor;
import entities.concretes.User;

public class AuthManager implements AuthService {

    private final UserService userService;

    public AuthManager(UserService userService) {
        this.userService = userService;
    }

    @Override
    public void register(User user) {
        userService.add(user);
        System.out.println("User Added success: " + user.getFirstName() + " " + user.getLastName());
        generateVerfyCode(user);
    }

    @Override
    public void login(User user) {
        User tempUser = userService.getByMail(user.getEmail());
        if (!user.getPassword().isBlank())
            if (tempUser != null && user.getPassword().equals(tempUser.getPassword())) {
                System.out.println("User Login successfully " + user.getFirstName() + " " + user.getLastName());
                return;
            }
        System.out.println("User Login not successfully, please check your email address and password");
    }

    @Override
    public void verify(User user, String verifyLink) {
        User tempUser = userService.getByUser(user.getId());
        if (tempUser.getVerificationCode().equals(verifyLink)) {
            tempUser.setVerifiled(true);
            System.out.println("verify Success");
            return;
        }
        System.out.println("verify not Success. Please Check The Link");

    }

    @Override
    public void loginWithGoogle() {
        GAuthService gAuthService = new GServicesManagerAdaptor();
        User user = gAuthService.registerWithGoogle();
        if (userService.getByMail(user.getEmail()) == null)
            userService.add(user);
        user.setVerifiled(true);
        System.out.println("Login With Google Is Success");
    }

    private void generateVerfyCode(User user) {
        int rndIndex = (int) Math.floor(Math.random() * 999999);
        String code = "https://gverify/user?verificationCode=" + rndIndex;
        user.setVerificationCode(code);
    }
}
