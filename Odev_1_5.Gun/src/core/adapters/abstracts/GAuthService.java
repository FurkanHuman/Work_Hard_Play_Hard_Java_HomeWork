package core.adapters.abstracts;

import entities.concretes.User;

public interface GAuthService {
    User registerWithGoogle();
}
