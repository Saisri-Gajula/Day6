let password = document.querySelector('.password');
let ConfirmPassword = document.querySelector('.confirm-password')
let MatchingWord = document.querySelector('.matching-txt')
let form = document.querySelector('.form')

function ComparingPasswords() {
    if (ConfirmPassword.value) {
    if (password.value != ConfirmPassword.value) {
       MatchingWord.style.display = 'block'
       MatchingWord.style.color = 'red'
       MatchingWord.innerHTML = 'Not Matching'
       return false
       e.preventDefault()

    } else {
        MatchingWord.style.display = 'block'
        MatchingWord.style.color = 'green'
        MatchingWord.innerHTML = 'Matching'
    }
} else {
    MatchingWord.style.display = 'none'
}
}
ConfirmPassword.addEventListener('keyup' , () => {
    ComparingPasswords()
})

password.addEventListener('keyup' , () => {
    ComparingPasswords()
})