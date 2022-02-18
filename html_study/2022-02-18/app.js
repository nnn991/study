const btn = document.querySelector('#btn');
const color = document.querySelector('.color');

// click event 구현
btn.addEventListener('click', (event) => {
    // console.log('button clicked!')
    
    // const randArr = getRandomNumber(0, 255);
    // const r = radnArr[0];
    // const g = radnArr[1];
    // const b = radnArr[2];

    const [r, g, b] = getRandomNumber(0, 255);
    // console.log(r);
    // console.log(g);
    // console.log(b);
    const rgbColor = `rgba(${r}, ${g}, ${b})`; 

    document.body.style.backgroundColor = rgbColor;
    color.textContent = rgbColor;
    color.style.color = rgbColor;
    
});

// 랜덤한 rgba값 호출 함수
function getRandomNumber(min, max) {
    let randomRGBArray = [];
    
    for (let i = 0; i < 3; i++) {
        const randomNumber = Math.floor(Math.random() * (max - min + 1)) + min;
        randomRGBArray.push(randomNumber);
    }
    return randomRGBArray;
}