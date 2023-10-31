(ns dots.typescript.classification-type-names
  (:refer-clojure :exclude [comment keyword])
  (:require ["typescript" :as typescript]))

(def comment (.-comment typescript/ClassificationTypeNames))

(def identifier (.-identifier typescript/ClassificationTypeNames))

(def keyword (.-keyword typescript/ClassificationTypeNames))

(def numeric-literal (.-numericLiteral typescript/ClassificationTypeNames))

(def bigint-literal (.-bigintLiteral typescript/ClassificationTypeNames))

(def operator (.-operator typescript/ClassificationTypeNames))

(def string-literal (.-stringLiteral typescript/ClassificationTypeNames))

(def white-space (.-whiteSpace typescript/ClassificationTypeNames))

(def text (.-text typescript/ClassificationTypeNames))

(def punctuation (.-punctuation typescript/ClassificationTypeNames))

(def class-name (.-className typescript/ClassificationTypeNames))

(def enum-name (.-enumName typescript/ClassificationTypeNames))

(def interface-name (.-interfaceName typescript/ClassificationTypeNames))

(def module-name (.-moduleName typescript/ClassificationTypeNames))

(def type-parameter-name (.-typeParameterName typescript/ClassificationTypeNames))

(def type-alias-name (.-typeAliasName typescript/ClassificationTypeNames))

(def parameter-name (.-parameterName typescript/ClassificationTypeNames))

(def doc-comment-tag-name (.-docCommentTagName typescript/ClassificationTypeNames))

(def jsx-open-tag-name (.-jsxOpenTagName typescript/ClassificationTypeNames))

(def jsx-close-tag-name (.-jsxCloseTagName typescript/ClassificationTypeNames))

(def jsx-self-closing-tag-name (.-jsxSelfClosingTagName typescript/ClassificationTypeNames))

(def jsx-attribute (.-jsxAttribute typescript/ClassificationTypeNames))

(def jsx-text (.-jsxText typescript/ClassificationTypeNames))

(def jsx-attribute-string-literal-value (.-jsxAttributeStringLiteralValue typescript/ClassificationTypeNames))
