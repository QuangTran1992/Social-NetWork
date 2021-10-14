const signInBtn = document.querySelector('.sign-in-btn');
const signUpBtn = document.querySelector('.sign-up-btn');
const formBx = document.querySelector('.form-bx');
const body = document.querySelector('body');
signUpBtn.onclick = function() {
    formBx.classList.add('active');
    body.classList.add('active');
}

signInBtn.onclick = function() {
    formBx.classList.remove('active');
    body.classList.remove('active');
}