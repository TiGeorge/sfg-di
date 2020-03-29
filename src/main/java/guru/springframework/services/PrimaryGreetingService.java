package guru.springframework.services;

public class PrimaryGreetingService implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGreetingService(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getEnglishGreeting();
    }

    public static class PrimarySpanishGreetingService implements GreetingService {

        private GreetingRepository greetingRepository;

        public PrimarySpanishGreetingService(GreetingRepository greetingRepository) {
            this.greetingRepository = greetingRepository;
        }

        @Override
        public String sayGreeting() {
            return greetingRepository.getSpanishGreeting();
        }
    }
}
