package grails.hexagonal

class User {

    String firstName
    String lastName
    String email

    static constraints = {
        email(email: true, unique: true)
        firstName(blank: false)
        lastName(blank: false)
    }
}
