public class UserController {
    private UserService userService;

    public UserVo getUserById(Long userId) {
        UserBo userBo = userService.getUserById(userId);
        UserVo userVo = [...];
        return userVo;
    }
}
