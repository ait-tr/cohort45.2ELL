const submitButtonElement = document.querySelector('#bmi-form button');

const inputWeightElement = document.querySelector('#weight');
const inputHeightElement = document.querySelector('#height');

const bmiResultElement = document.querySelector('#bmi-result');
const bmiCommentResult = document.querySelector('#bmi-status');

const alertElement = document.querySelector('.alert');

submitButtonElement.addEventListener('click', submitButtonHandler);

function submitButtonHandler(evt) {
  evt.preventDefault();
  const bodyMass = inputWeightElement.value;
  const bodyHeight = inputHeightElement.value / 100;

  if(bodyHeight <=0 || bodyMass <= 0) {
    showAlert();
  } else {
    removeAlert();

    const bmiResult = (bodyMass / (bodyHeight * bodyHeight)).toFixed(2);
    bmiResultElement.textContent = `Ваш BMI: ${bmiResult}`;
  
    const bodyBmiComment = getBmiComment(bmiResult);
    bmiCommentResult.textContent = `Статус: ${bodyBmiComment}`;

    inputWeightElement.value = '';
    inputHeightElement.value = '';
  }
}

function getBmiComment(bmi) {
  bmi = +bmi;
  if (bmi <= 16) {
    return 'Выраженный дефицит массы тела';
  } else if (bmi <= 18.5) {
    return 'Недостаточная (дефицит) масса тела';
  } else if (bmi <= 25) {
    return 'Норма';
  } else if (bmi <= 30) {
    return 'Избыточная масса тела (предожирение)';
  } else if (bmi <= 35) {
    return 'Ожирение 1 степени';
  } else if (bmi <= 40) {
    return 'Ожирение 2 степени';
  } else {
    return 'Ожирение 3 степени';
  }
}

function showAlert() {
    alertElement.textContent = 'Соберитесь, введите корректные значения';
}

function removeAlert() {
  alertElement.textContent = '';
}
