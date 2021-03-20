package com.tadeifelipe.awsimageupload.datastore;

import com.tadeifelipe.awsimageupload.profile.UserProfile;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class FakeUserProfileDataStore {

    private static final List<UserProfile> USER_PROFILES = new ArrayList<>();

    static {
        USER_PROFILES.add(new UserProfile(UUID.fromString("b3741de5-949a-4085-97bd-f26610f6d23d"), "janetjones", null));
        USER_PROFILES.add(new UserProfile(UUID.fromString("2dafa7ed-6359-45a4-822c-e5eb45d3beaa"), "antoniojunior", null));
    }

    public List<UserProfile> getUserProfiles() {
        return USER_PROFILES;
    }
}
