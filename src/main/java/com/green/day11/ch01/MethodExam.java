package com.green.day11.ch01;

public class MethodExam {
    String scoreResultOpt(int n) {
        int i = n % 10;
        String h;
        String k = "입니다";

        if (n < 0 || n > 100) {
            h = "잘못된 점수입니다";
            return h;
        }

        if (n >= 90) {
            if (i > 8 || i == 0) {
                h = "A+입니다";
            } else if (i <= 3) {
                h = "A-입니다";
            } else {
                h = "A0입니다";
            }
        } else if (n > 79) {
            if (i > 8 || i == 0) {
                h = "B+입니다";
            } else if (i <= 3) {
                h = "B-입니다";
            } else {
                h = "B0입니다";
            }
        }
        else if (n > 69) {
            if (i > 8 || i == 0) {
                h = "C+입니다";
            } else if (i <= 3) {
                h = "C-입니다";
            } else {
                h = "C0입니다";
            }
        }

        else {
            if (i > 8 || i == 0) {
                h = "D+입니다";
            } else if (i <= 3) {
                h = "D-입니다";
            } else {
                h = "D0입니다";
            }
        }

        return h;
    }

    String scoreResultOptV2(int n) {
        int i = n % 10;
        int j = n / 10;

        String h;
        if(n < 0 || n > 100) {
            h = "점수를 확인해주세요";
            return h;
        }

        else {
            switch(j) {
                case 9: case 10:
                    if(i > 8 || i == 0) {
                        h = "A+";
                    }
                    else if(i <= 3) {
                        h = "A-";
                    }

                    else {
                        h = "A0";
                    }
                    break;

                case 8:
                    if(i > 8 || i == 0) {
                        h = "B+";
                    }
                    else if(i <= 3) {
                        h = "B-";
                    }

                    else {
                        h = "B0";
                    }
                    break;

                case 7:
                    if(i > 8 || i == 0) {
                        h = "C+";
                    }
                    else if(i <= 3) {
                        h = "C-";
                    }

                    else {
                        h = "C0";
                    }
                    break;

                default:
                    if(i > 8 || i == 0) {
                        h = "D+";
                    }
                    else if(i <= 3) {
                        h = "D-";
                    }

                    else {
                        h = "D0";
                    }
                    break;
            }
        }
        return h;
    }

    String getSeason(int n) {
        String s;

        switch(n) {
            case 3, 4, 5:
                s = "봄";
                break;
            case 6: case 7: case 8:
                s = "여름";
                break;
            case 9: case 10: case 11:
                s = "가을";
                break;
            case 12: case 1: case 2:
                s = "겨울";
                break;
            default:
                s = "없음";
                break;
        }

        return s;
    }

    String getSeasonV2(int n) {
        String i;

        do {
            if(n == 3 || n == 4 || n == 5) {
                i = "봄";
                return i;

            }

            if(n == 6 || n == 7 || n == 8) {
                i = "여름";
                return i;
            }

            if(n == 9 || n == 10 || n == 11) {
                i = "가을";
                return i;
            }

            if(n == 12 || n == 1 || n == 2) {
                i = "겨울";
                return i;
            }

            else {
                i = "없음";
                return i;
            }

        } while(n < 0);
    }

}

