(ns dots.typescript.declaration-statement
  (:refer-clojure :exclude [name]))

(defn name
  ^js [declaration-statement]
  (.-name ^js declaration-statement))

(defn kind
  ^js [declaration-statement]
  (.-kind ^js declaration-statement))

(defn flags
  ^js [declaration-statement]
  (.-flags ^js declaration-statement))

(defn parent
  ^js [declaration-statement]
  (.-parent ^js declaration-statement))

(defn source-file
  ^js [declaration-statement]
  (.getSourceFile ^js declaration-statement))

(defn child-count
  (^js [declaration-statement]
   (.getChildCount ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getChildCount ^js declaration-statement source-file)))

(defn child-at
  (^js [declaration-statement index]
   (.getChildAt ^js declaration-statement index))
  (^js [declaration-statement index source-file]
   (.getChildAt ^js declaration-statement index source-file)))

(defn children
  (^js [declaration-statement]
   (.getChildren ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getChildren ^js declaration-statement source-file)))

(defn start
  (^js [declaration-statement]
   (.getStart ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getStart ^js declaration-statement source-file))
  (^js [declaration-statement source-file include-js-doc-comment?]
   (.getStart ^js declaration-statement source-file include-js-doc-comment?)))

(defn full-start
  ^js [declaration-statement]
  (.getFullStart ^js declaration-statement))

(defn get-end
  ^js [declaration-statement]
  (.getEnd ^js declaration-statement))

(defn width
  (^js [declaration-statement]
   (.getWidth ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getWidth ^js declaration-statement source-file)))

(defn full-width
  ^js [declaration-statement]
  (.getFullWidth ^js declaration-statement))

(defn leading-trivia-width
  (^js [declaration-statement]
   (.getLeadingTriviaWidth ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getLeadingTriviaWidth ^js declaration-statement source-file)))

(defn full-text
  (^js [declaration-statement]
   (.getFullText ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getFullText ^js declaration-statement source-file)))

(defn text
  (^js [declaration-statement]
   (.getText ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getText ^js declaration-statement source-file)))

(defn first-token
  (^js [declaration-statement]
   (.getFirstToken ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getFirstToken ^js declaration-statement source-file)))

(defn last-token
  (^js [declaration-statement]
   (.getLastToken ^js declaration-statement))
  (^js [declaration-statement source-file]
   (.getLastToken ^js declaration-statement source-file)))

(defn for-each-child
  (^js [declaration-statement cb-node]
   (.forEachChild ^js declaration-statement cb-node))
  (^js [declaration-statement cb-node cb-node-array]
   (.forEachChild ^js declaration-statement cb-node cb-node-array)))

(defn decorators
  ^js [declaration-statement]
  (.-decorators ^js declaration-statement))

(defn modifiers
  ^js [declaration-statement]
  (.-modifiers ^js declaration-statement))

(defn pos
  ^js [declaration-statement]
  (.-pos ^js declaration-statement))

(defn end
  ^js [declaration-statement]
  (.-end ^js declaration-statement))
