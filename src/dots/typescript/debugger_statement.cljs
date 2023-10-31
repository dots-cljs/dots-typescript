(ns dots.typescript.debugger-statement)

(defn kind
  ^js [debugger-statement]
  (.-kind ^js debugger-statement))

(defn flags
  ^js [debugger-statement]
  (.-flags ^js debugger-statement))

(defn parent
  ^js [debugger-statement]
  (.-parent ^js debugger-statement))

(defn source-file
  ^js [debugger-statement]
  (.getSourceFile ^js debugger-statement))

(defn child-count
  (^js [debugger-statement]
   (.getChildCount ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getChildCount ^js debugger-statement source-file)))

(defn child-at
  (^js [debugger-statement index]
   (.getChildAt ^js debugger-statement index))
  (^js [debugger-statement index source-file]
   (.getChildAt ^js debugger-statement index source-file)))

(defn children
  (^js [debugger-statement]
   (.getChildren ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getChildren ^js debugger-statement source-file)))

(defn start
  (^js [debugger-statement]
   (.getStart ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getStart ^js debugger-statement source-file))
  (^js [debugger-statement source-file include-js-doc-comment?]
   (.getStart ^js debugger-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [debugger-statement]
  (.getFullStart ^js debugger-statement))

(defn get-end
  ^js [debugger-statement]
  (.getEnd ^js debugger-statement))

(defn width
  (^js [debugger-statement]
   (.getWidth ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getWidth ^js debugger-statement source-file)))

(defn full-width
  ^js [debugger-statement]
  (.getFullWidth ^js debugger-statement))

(defn leading-trivia-width
  (^js [debugger-statement]
   (.getLeadingTriviaWidth ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getLeadingTriviaWidth ^js debugger-statement source-file)))

(defn full-text
  (^js [debugger-statement]
   (.getFullText ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getFullText ^js debugger-statement source-file)))

(defn text
  (^js [debugger-statement]
   (.getText ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getText ^js debugger-statement source-file)))

(defn first-token
  (^js [debugger-statement]
   (.getFirstToken ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getFirstToken ^js debugger-statement source-file)))

(defn last-token
  (^js [debugger-statement]
   (.getLastToken ^js debugger-statement))
  (^js [debugger-statement source-file]
   (.getLastToken ^js debugger-statement source-file)))

(defn for-each-child
  (^js [debugger-statement cb-node]
   (.forEachChild ^js debugger-statement cb-node))
  (^js [debugger-statement cb-node cb-node-array]
   (.forEachChild ^js debugger-statement cb-node cb-node-array)))

(defn decorators
  ^js [debugger-statement]
  (.-decorators ^js debugger-statement))

(defn modifiers
  ^js [debugger-statement]
  (.-modifiers ^js debugger-statement))

(defn pos
  ^js [debugger-statement]
  (.-pos ^js debugger-statement))

(defn end
  ^js [debugger-statement]
  (.-end ^js debugger-statement))
