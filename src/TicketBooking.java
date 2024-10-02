public class TicketBooking {
    private String movieTitle;
    private String seatNumber;
    private String snackCombo;
    public static class TicketBookingBuilder {
        private String movieTitle;
        private String seatNumber;
        private String snackCombo;
        public TicketBookingBuilder setMovieTitle(String title) {
            this.movieTitle = title;
            return this;
        }

        public TicketBookingBuilder setSeatNumber(String seat) {
            this.seatNumber = seat;
            return this;
        }

        public TicketBookingBuilder setSnackCombo(String combo) {
            this.snackCombo = combo;
            return this;
        }

        public TicketBooking build() {
            return new TicketBooking(this);
        }

    }
}
