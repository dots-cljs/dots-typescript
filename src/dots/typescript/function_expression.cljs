(ns dots.typescript.function-expression
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [function-expression]
  (.-kind ^js function-expression))

(defn modifiers
  ^js [function-expression]
  (.-modifiers ^js function-expression))

(defn name
  ^js [function-expression]
  (.-name ^js function-expression))

(defn body
  ^js [function-expression]
  (.-body ^js function-expression))

(defn flags
  ^js [function-expression]
  (.-flags ^js function-expression))

(defn parent
  ^js [function-expression]
  (.-parent ^js function-expression))

(defn source-file
  ^js [function-expression]
  (.getSourceFile ^js function-expression))

(defn child-count
  (^js [function-expression]
   (.getChildCount ^js function-expression))
  (^js [function-expression source-file]
   (.getChildCount ^js function-expression source-file)))

(defn child-at
  (^js [function-expression index]
   (.getChildAt ^js function-expression index))
  (^js [function-expression index source-file]
   (.getChildAt ^js function-expression index source-file)))

(defn children
  (^js [function-expression]
   (.getChildren ^js function-expression))
  (^js [function-expression source-file]
   (.getChildren ^js function-expression source-file)))

(defn start
  (^js [function-expression]
   (.getStart ^js function-expression))
  (^js [function-expression source-file]
   (.getStart ^js function-expression source-file))
  (^js [function-expression source-file include-js-doc-comment?]
   (.getStart ^js function-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [function-expression]
  (.getFullStart ^js function-expression))

(defn get-end
  ^js [function-expression]
  (.getEnd ^js function-expression))

(defn width
  (^js [function-expression]
   (.getWidth ^js function-expression))
  (^js [function-expression source-file]
   (.getWidth ^js function-expression source-file)))

(defn full-width
  ^js [function-expression]
  (.getFullWidth ^js function-expression))

(defn leading-trivia-width
  (^js [function-expression]
   (.getLeadingTriviaWidth ^js function-expression))
  (^js [function-expression source-file]
   (.getLeadingTriviaWidth ^js function-expression source-file)))

(defn full-text
  (^js [function-expression]
   (.getFullText ^js function-expression))
  (^js [function-expression source-file]
   (.getFullText ^js function-expression source-file)))

(defn text
  (^js [function-expression]
   (.getText ^js function-expression))
  (^js [function-expression source-file]
   (.getText ^js function-expression source-file)))

(defn first-token
  (^js [function-expression]
   (.getFirstToken ^js function-expression))
  (^js [function-expression source-file]
   (.getFirstToken ^js function-expression source-file)))

(defn last-token
  (^js [function-expression]
   (.getLastToken ^js function-expression))
  (^js [function-expression source-file]
   (.getLastToken ^js function-expression source-file)))

(defn for-each-child
  (^js [function-expression cb-node]
   (.forEachChild ^js function-expression cb-node))
  (^js [function-expression cb-node cb-node-array]
   (.forEachChild ^js function-expression cb-node cb-node-array)))

(defn pos
  ^js [function-expression]
  (.-pos ^js function-expression))

(defn end
  ^js [function-expression]
  (.-end ^js function-expression))

(defn asterisk-token
  ^js [function-expression]
  (.-asteriskToken ^js function-expression))

(defn question-token
  ^js [function-expression]
  (.-questionToken ^js function-expression))

(defn exclamation-token
  ^js [function-expression]
  (.-exclamationToken ^js function-expression))

(defn type-parameters
  ^js [function-expression]
  (.-typeParameters ^js function-expression))

(defn parameters
  ^js [function-expression]
  (.-parameters ^js function-expression))

(defn type
  ^js [function-expression]
  (.-type ^js function-expression))
