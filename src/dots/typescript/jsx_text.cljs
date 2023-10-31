(ns dots.typescript.jsx-text)

(defn kind
  ^js [jsx-text]
  (.-kind ^js jsx-text))

(defn parent
  ^js [jsx-text]
  (.-parent ^js jsx-text))

(defn contains-only-trivia-white-spaces?
  ^js [jsx-text]
  (.-containsOnlyTriviaWhiteSpaces ^js jsx-text))

(defn text
  ^js [jsx-text]
  (.-text ^js jsx-text))

(defn set-text!
  ^js [jsx-text value]
  (set! (.-text ^js jsx-text) value))

(defn unterminated?
  ^js [jsx-text]
  (.-isUnterminated ^js jsx-text))

(defn set-is-unterminated!
  ^js [jsx-text value]
  (set! (.-isUnterminated ^js jsx-text) value))

(defn has-extended-unicode-escape?
  ^js [jsx-text]
  (.-hasExtendedUnicodeEscape ^js jsx-text))

(defn set-has-extended-unicode-escape!
  ^js [jsx-text value]
  (set! (.-hasExtendedUnicodeEscape ^js jsx-text) value))

(defn flags
  ^js [jsx-text]
  (.-flags ^js jsx-text))

(defn source-file
  ^js [jsx-text]
  (.getSourceFile ^js jsx-text))

(defn child-count
  (^js [jsx-text]
   (.getChildCount ^js jsx-text))
  (^js [jsx-text source-file]
   (.getChildCount ^js jsx-text source-file)))

(defn child-at
  (^js [jsx-text index]
   (.getChildAt ^js jsx-text index))
  (^js [jsx-text index source-file]
   (.getChildAt ^js jsx-text index source-file)))

(defn children
  (^js [jsx-text]
   (.getChildren ^js jsx-text))
  (^js [jsx-text source-file]
   (.getChildren ^js jsx-text source-file)))

(defn start
  (^js [jsx-text]
   (.getStart ^js jsx-text))
  (^js [jsx-text source-file]
   (.getStart ^js jsx-text source-file))
  (^js [jsx-text source-file include-js-doc-comment?]
   (.getStart ^js jsx-text source-file include-js-doc-comment?)))

(defn full-start
  ^js [jsx-text]
  (.getFullStart ^js jsx-text))

(defn get-end
  ^js [jsx-text]
  (.getEnd ^js jsx-text))

(defn width
  (^js [jsx-text]
   (.getWidth ^js jsx-text))
  (^js [jsx-text source-file]
   (.getWidth ^js jsx-text source-file)))

(defn full-width
  ^js [jsx-text]
  (.getFullWidth ^js jsx-text))

(defn leading-trivia-width
  (^js [jsx-text]
   (.getLeadingTriviaWidth ^js jsx-text))
  (^js [jsx-text source-file]
   (.getLeadingTriviaWidth ^js jsx-text source-file)))

(defn full-text
  (^js [jsx-text]
   (.getFullText ^js jsx-text))
  (^js [jsx-text source-file]
   (.getFullText ^js jsx-text source-file)))

(defn get-text
  (^js [jsx-text]
   (.getText ^js jsx-text))
  (^js [jsx-text source-file]
   (.getText ^js jsx-text source-file)))

(defn first-token
  (^js [jsx-text]
   (.getFirstToken ^js jsx-text))
  (^js [jsx-text source-file]
   (.getFirstToken ^js jsx-text source-file)))

(defn last-token
  (^js [jsx-text]
   (.getLastToken ^js jsx-text))
  (^js [jsx-text source-file]
   (.getLastToken ^js jsx-text source-file)))

(defn for-each-child
  (^js [jsx-text cb-node]
   (.forEachChild ^js jsx-text cb-node))
  (^js [jsx-text cb-node cb-node-array]
   (.forEachChild ^js jsx-text cb-node cb-node-array)))

(defn decorators
  ^js [jsx-text]
  (.-decorators ^js jsx-text))

(defn modifiers
  ^js [jsx-text]
  (.-modifiers ^js jsx-text))

(defn pos
  ^js [jsx-text]
  (.-pos ^js jsx-text))

(defn end
  ^js [jsx-text]
  (.-end ^js jsx-text))
