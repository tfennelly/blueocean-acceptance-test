node {
   stage 'Stage 1'
   sh 'sleep 3; echo `date` Stage 1;'
   sh 'sleep 3; echo `date` Stage 1;'
}
node {
    stage 'Stage 2'
    parallel firstBranch: {
        sh 'echo `date` Stage 2 - first;sleep 3; echo `date` Stage 2 - first;sleep 3; echo `date` Stage 2 - first;'

    }, secondBranch: {
        sh 'echo `date` Stage 2 - second;sleep 3; echo `date` Stage 2 - second;sleep 3; echo `date` Stage 2 - second;'
    },
    failFast: true
}
node {
    stage 'fin'
    sh 'echo `date` fin;sleep 3; echo `date` fin;'
}