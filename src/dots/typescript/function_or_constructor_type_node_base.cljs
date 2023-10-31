(ns dots.typescript.function-or-constructor-type-node-base
  (:refer-clojure :exclude [name type]))

(defn kind
  ^js [function-or-constructor-type-node-base]
  (.-kind ^js function-or-constructor-type-node-base))

(defn type
  ^js [function-or-constructor-type-node-base]
  (.-type ^js function-or-constructor-type-node-base))

(defn flags
  ^js [function-or-constructor-type-node-base]
  (.-flags ^js function-or-constructor-type-node-base))

(defn parent
  ^js [function-or-constructor-type-node-base]
  (.-parent ^js function-or-constructor-type-node-base))

(defn source-file
  ^js [function-or-constructor-type-node-base]
  (.getSourceFile ^js function-or-constructor-type-node-base))

(defn child-count
  (^js [function-or-constructor-type-node-base]
   (.getChildCount ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getChildCount ^js function-or-constructor-type-node-base source-file)))

(defn child-at
  (^js [function-or-constructor-type-node-base index]
   (.getChildAt ^js function-or-constructor-type-node-base index))
  (^js [function-or-constructor-type-node-base index source-file]
   (.getChildAt ^js function-or-constructor-type-node-base index source-file)))

(defn children
  (^js [function-or-constructor-type-node-base]
   (.getChildren ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getChildren ^js function-or-constructor-type-node-base source-file)))

(defn start
  (^js [function-or-constructor-type-node-base]
   (.getStart ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getStart ^js function-or-constructor-type-node-base source-file))
  (^js [function-or-constructor-type-node-base source-file include-js-doc-comment?]
   (.getStart ^js function-or-constructor-type-node-base source-file include-js-doc-comment?)))

(defn full-start
  ^js [function-or-constructor-type-node-base]
  (.getFullStart ^js function-or-constructor-type-node-base))

(defn get-end
  ^js [function-or-constructor-type-node-base]
  (.getEnd ^js function-or-constructor-type-node-base))

(defn width
  (^js [function-or-constructor-type-node-base]
   (.getWidth ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getWidth ^js function-or-constructor-type-node-base source-file)))

(defn full-width
  ^js [function-or-constructor-type-node-base]
  (.getFullWidth ^js function-or-constructor-type-node-base))

(defn leading-trivia-width
  (^js [function-or-constructor-type-node-base]
   (.getLeadingTriviaWidth ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getLeadingTriviaWidth ^js function-or-constructor-type-node-base source-file)))

(defn full-text
  (^js [function-or-constructor-type-node-base]
   (.getFullText ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getFullText ^js function-or-constructor-type-node-base source-file)))

(defn text
  (^js [function-or-constructor-type-node-base]
   (.getText ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getText ^js function-or-constructor-type-node-base source-file)))

(defn first-token
  (^js [function-or-constructor-type-node-base]
   (.getFirstToken ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getFirstToken ^js function-or-constructor-type-node-base source-file)))

(defn last-token
  (^js [function-or-constructor-type-node-base]
   (.getLastToken ^js function-or-constructor-type-node-base))
  (^js [function-or-constructor-type-node-base source-file]
   (.getLastToken ^js function-or-constructor-type-node-base source-file)))

(defn for-each-child
  (^js [function-or-constructor-type-node-base cb-node]
   (.forEachChild ^js function-or-constructor-type-node-base cb-node))
  (^js [function-or-constructor-type-node-base cb-node cb-node-array]
   (.forEachChild ^js function-or-constructor-type-node-base cb-node cb-node-array)))

(defn decorators
  ^js [function-or-constructor-type-node-base]
  (.-decorators ^js function-or-constructor-type-node-base))

(defn modifiers
  ^js [function-or-constructor-type-node-base]
  (.-modifiers ^js function-or-constructor-type-node-base))

(defn pos
  ^js [function-or-constructor-type-node-base]
  (.-pos ^js function-or-constructor-type-node-base))

(defn end
  ^js [function-or-constructor-type-node-base]
  (.-end ^js function-or-constructor-type-node-base))

(defn name
  ^js [function-or-constructor-type-node-base]
  (.-name ^js function-or-constructor-type-node-base))

(defn type-parameters
  ^js [function-or-constructor-type-node-base]
  (.-typeParameters ^js function-or-constructor-type-node-base))

(defn parameters
  ^js [function-or-constructor-type-node-base]
  (.-parameters ^js function-or-constructor-type-node-base))
