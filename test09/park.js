let weight = prompt("제한 몸무게 입력");
weight = Number(weight);
let cnt = prompt("탑승 인원 입력");
cnt = Number(cnt);

let friend = prompt("탑승 인원 몸무게").split(" ");

let sum = 0;
for (let i = 0; i < cnt; i++) {
    sum += friend[i];
    if (sum > weight) {
        console.log('탑승인원 >> ' + (i + 1));
        break;
    }
}
