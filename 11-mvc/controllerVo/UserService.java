public class UserService {
    private UserRepository UserRepository;

    public UserBo getUserById(Long userId) {
        UserEntity userEntity = UserRepository.getUserById(userId);
        UserBo userBo = [...];
        return userBo
    }
}
