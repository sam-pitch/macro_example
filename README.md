# Macro Weirdness

## Steps to reproduce

1. Clone this repo
2. Install shadow-cljs npm module
```bash
npm install -g shadow-cljs
```
3. Run the project
```
shadow-cljs watch app
```
4. Connect to the nREPL with your editor.
5. Load the `example` ns and check the value of `bar`
6. Load the `core` ns and check the value of `bar`. Notice the values are the same.
7. Edit the content of `short.txt`
8. Reload the `example` ns and see that the value of `bar` has now changed.
9. Reload the `core` ns and see that the value of `bar` has *NOT* changed.
10. ???
