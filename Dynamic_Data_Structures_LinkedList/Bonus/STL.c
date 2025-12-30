#include <iostream>
#include <list>
using namespace std;

int main() {
    list<int> ll;

    // Insert elements
    ll.push_back(10);
    ll.push_back(20);
    ll.push_front(5);

    // Display elements
    cout << "Linked List elements: ";
    for (int x : ll) {
        cout << x << " ";
    }

    // Remove an element
    ll.remove(20);

    cout << "\nAfter deleting 20: ";
    for (int x : ll) {
        cout << x << " ";
    }

    return 0;
}
