#include <iostream>
#include <string>
using namespace std;
int main() {
    string s = "Neeraj123@!";
    int upper = 0, lower = 0, digit = 0, special = 0;
    for (char ch : s) {
        if (isupper(ch)) {
            upper++;
        }  
        if(islower(ch)) {
            lower++;
        }else {
            special++;
        }
    }
    cout << "uppercase Letters: " << upper << endl;
    cout << "lowercase Letters: " << lower << endl;
    cout << "digits: " << digit << endl;
    cout << "special Characters: " << special << endl;
    return 0;
}
