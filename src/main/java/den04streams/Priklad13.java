package den04streams;

import java.util.List;

final class Priklad13 {

    public static void main(String[] args) {
        List<String> zaznamy = List.of(
                "LOGIN:anna:2024-01-10",
                "LOGOUT:peter:2024-01-10",
                "LOGIN:lucia:2024-01-11",
                "ERROR:anna:Invalid password",
                "LOGIN:peter:2024-01-12",
                "ERROR:martin:Timeout",
                "LOGOUT:anna:2024-01-12",
                "LOGIN:eva:2024-01-13",
                "ERROR:peter:Access denied",
                "LOGIN:anna:2024-01-14"
        );
    }
}
