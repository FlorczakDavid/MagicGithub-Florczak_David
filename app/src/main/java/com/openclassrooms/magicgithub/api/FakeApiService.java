package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {

    private List<User> users = generateUsers();

    /**
     * Return a list of {@link User}
     * Those users must be generated by {@link FakeApiServiceGenerator}
     */
    @Override
    public List<User> getUsers() {
        // TODO: A modifier
        return users;

    }

    /**
     * Generate a random {@link User} and add it {@link FakeApiService#users} list.
     * This user must be get from the {@link FakeApiServiceGenerator#FAKE_USERS_RANDOM} list.
     */
    @Override
    public void generateRandomUser() {
        // TODO: A modifier

        List<User> randomUsers = new ArrayList<>(FakeApiServiceGenerator.FAKE_USERS_RANDOM);

        Random random = new Random();
        int randomInt = random.nextInt(randomUsers.toArray().length);

        users.add(randomUsers.get(randomInt));
//        for (int i = 0; i < randomUsers.toArray().length; i++) {
//            users.add(randomUsers.get(i));
//        }
    }

    /**
     * Delete a {@link User} from the {@link FakeApiService#users} list.
     */
    @Override
    public void deleteUser(User user) {
        // TODO: A modifier
        users.remove(user);
    }
}
