(ns dots.typescript.named-exports)

(defn kind
  ^js [named-exports]
  (.-kind ^js named-exports))

(defn parent
  ^js [named-exports]
  (.-parent ^js named-exports))

(defn elements
  ^js [named-exports]
  (.-elements ^js named-exports))

(defn flags
  ^js [named-exports]
  (.-flags ^js named-exports))

(defn source-file
  ^js [named-exports]
  (.getSourceFile ^js named-exports))

(defn child-count
  (^js [named-exports]
   (.getChildCount ^js named-exports))
  (^js [named-exports source-file]
   (.getChildCount ^js named-exports source-file)))

(defn child-at
  (^js [named-exports index]
   (.getChildAt ^js named-exports index))
  (^js [named-exports index source-file]
   (.getChildAt ^js named-exports index source-file)))

(defn children
  (^js [named-exports]
   (.getChildren ^js named-exports))
  (^js [named-exports source-file]
   (.getChildren ^js named-exports source-file)))

(defn start
  (^js [named-exports]
   (.getStart ^js named-exports))
  (^js [named-exports source-file]
   (.getStart ^js named-exports source-file))
  (^js [named-exports source-file include-js-doc-comment?]
   (.getStart ^js named-exports source-file include-js-doc-comment?)))

(defn full-start
  ^js [named-exports]
  (.getFullStart ^js named-exports))

(defn get-end
  ^js [named-exports]
  (.getEnd ^js named-exports))

(defn width
  (^js [named-exports]
   (.getWidth ^js named-exports))
  (^js [named-exports source-file]
   (.getWidth ^js named-exports source-file)))

(defn full-width
  ^js [named-exports]
  (.getFullWidth ^js named-exports))

(defn leading-trivia-width
  (^js [named-exports]
   (.getLeadingTriviaWidth ^js named-exports))
  (^js [named-exports source-file]
   (.getLeadingTriviaWidth ^js named-exports source-file)))

(defn full-text
  (^js [named-exports]
   (.getFullText ^js named-exports))
  (^js [named-exports source-file]
   (.getFullText ^js named-exports source-file)))

(defn text
  (^js [named-exports]
   (.getText ^js named-exports))
  (^js [named-exports source-file]
   (.getText ^js named-exports source-file)))

(defn first-token
  (^js [named-exports]
   (.getFirstToken ^js named-exports))
  (^js [named-exports source-file]
   (.getFirstToken ^js named-exports source-file)))

(defn last-token
  (^js [named-exports]
   (.getLastToken ^js named-exports))
  (^js [named-exports source-file]
   (.getLastToken ^js named-exports source-file)))

(defn for-each-child
  (^js [named-exports cb-node]
   (.forEachChild ^js named-exports cb-node))
  (^js [named-exports cb-node cb-node-array]
   (.forEachChild ^js named-exports cb-node cb-node-array)))

(defn decorators
  ^js [named-exports]
  (.-decorators ^js named-exports))

(defn modifiers
  ^js [named-exports]
  (.-modifiers ^js named-exports))

(defn pos
  ^js [named-exports]
  (.-pos ^js named-exports))

(defn end
  ^js [named-exports]
  (.-end ^js named-exports))
