import com.efrei.Olympicticketing.repository.UserRepository;

@Service
@Slf4j
public class UserService {
    private final UserRepository userRepository;

    @Transactional(rollbackOn = FunctionalException.class)
    public User addUsers (UserDto user) {
        userRepository.addUsers(user) 
        User newUser = userRepository.findUserName(user.name);
        return newUser;
    }
}