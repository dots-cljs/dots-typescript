(ns dots.typescript.super-property-access-expression
  (:refer-clojure :exclude [name]))

(defn expression
  ^js [super-property-access-expression]
  (.-expression ^js super-property-access-expression))

(defn kind
  ^js [super-property-access-expression]
  (.-kind ^js super-property-access-expression))

(defn question-dot-token
  ^js [super-property-access-expression]
  (.-questionDotToken ^js super-property-access-expression))

(defn name
  ^js [super-property-access-expression]
  (.-name ^js super-property-access-expression))

(defn flags
  ^js [super-property-access-expression]
  (.-flags ^js super-property-access-expression))

(defn parent
  ^js [super-property-access-expression]
  (.-parent ^js super-property-access-expression))

(defn source-file
  ^js [super-property-access-expression]
  (.getSourceFile ^js super-property-access-expression))

(defn child-count
  (^js [super-property-access-expression]
   (.getChildCount ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getChildCount ^js super-property-access-expression source-file)))

(defn child-at
  (^js [super-property-access-expression index]
   (.getChildAt ^js super-property-access-expression index))
  (^js [super-property-access-expression index source-file]
   (.getChildAt ^js super-property-access-expression index source-file)))

(defn children
  (^js [super-property-access-expression]
   (.getChildren ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getChildren ^js super-property-access-expression source-file)))

(defn start
  (^js [super-property-access-expression]
   (.getStart ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getStart ^js super-property-access-expression source-file))
  (^js [super-property-access-expression source-file include-js-doc-comment?]
   (.getStart ^js super-property-access-expression source-file include-js-doc-comment?)))

(defn full-start
  ^js [super-property-access-expression]
  (.getFullStart ^js super-property-access-expression))

(defn get-end
  ^js [super-property-access-expression]
  (.getEnd ^js super-property-access-expression))

(defn width
  (^js [super-property-access-expression]
   (.getWidth ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getWidth ^js super-property-access-expression source-file)))

(defn full-width
  ^js [super-property-access-expression]
  (.getFullWidth ^js super-property-access-expression))

(defn leading-trivia-width
  (^js [super-property-access-expression]
   (.getLeadingTriviaWidth ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getLeadingTriviaWidth ^js super-property-access-expression source-file)))

(defn full-text
  (^js [super-property-access-expression]
   (.getFullText ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getFullText ^js super-property-access-expression source-file)))

(defn text
  (^js [super-property-access-expression]
   (.getText ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getText ^js super-property-access-expression source-file)))

(defn first-token
  (^js [super-property-access-expression]
   (.getFirstToken ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getFirstToken ^js super-property-access-expression source-file)))

(defn last-token
  (^js [super-property-access-expression]
   (.getLastToken ^js super-property-access-expression))
  (^js [super-property-access-expression source-file]
   (.getLastToken ^js super-property-access-expression source-file)))

(defn for-each-child
  (^js [super-property-access-expression cb-node]
   (.forEachChild ^js super-property-access-expression cb-node))
  (^js [super-property-access-expression cb-node cb-node-array]
   (.forEachChild ^js super-property-access-expression cb-node cb-node-array)))

(defn decorators
  ^js [super-property-access-expression]
  (.-decorators ^js super-property-access-expression))

(defn modifiers
  ^js [super-property-access-expression]
  (.-modifiers ^js super-property-access-expression))

(defn pos
  ^js [super-property-access-expression]
  (.-pos ^js super-property-access-expression))

(defn end
  ^js [super-property-access-expression]
  (.-end ^js super-property-access-expression))
